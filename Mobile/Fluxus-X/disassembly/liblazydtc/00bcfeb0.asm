; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bcfeb0
00bcfeb0	paciasp
00bcfeb4	stp x29,x30,[sp, #-0x20]!
00bcfeb8	stp x20,x19,[sp, #0x10]
00bcfebc	mov x29,sp
00bcfec0	mov x20,x1
00bcfec4	mov x19,x0
00bcfec8	bl 0x00c43fc0
00bcfecc	cmn w0,#0x1
00bcfed0	b.eq 0x00bcfed8
00bcfed4	strb w0,[x20]
00bcfed8	mov x0,x19
00bcfedc	ldp x20,x19,[sp, #0x10]
00bcfee0	ldp x29,x30,[sp], #0x20
00bcfee4	autiasp
00bcfee8	ret
