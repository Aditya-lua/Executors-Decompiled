use strict;
use warnings;

local $/;
my $text = <>;

# ILSpy 11.2 emits constructor arguments for several XAML markup extensions as
# synthetic <Ctor> nodes.  WPF's XAML compiler does not understand those nodes,
# so translate them back into the equivalent public properties.
$text =~ s{<Binding([^>]*)>\s*<Ctor xmlns="https://github\.com/icsharpcode/ILSpy">([^<]+)</Ctor>}{<Binding$1 Path="$2">}g;
$text =~ s{<RelativeSource([^>]*)>\s*<Ctor xmlns="https://github\.com/icsharpcode/ILSpy">([^<]+)</Ctor>}{<RelativeSource$1 Mode="$2">}g;
$text =~ s{<x:TypeExtension>\s*<Ctor xmlns="https://github\.com/icsharpcode/ILSpy">([^<]+)</Ctor>\s*</x:TypeExtension>}{<x:Type TypeName="$1" />}g;
$text =~ s{<StaticResourceExtension xmlns="">\s*<Ctor xmlns="https://github\.com/icsharpcode/ILSpy">([^<]+)</Ctor>\s*</StaticResourceExtension>}{<StaticResourceExtension ResourceKey="$1" />}g;
$text =~ s{<NullExtension\s*/>}{<x:Null />}g;

print $text;
