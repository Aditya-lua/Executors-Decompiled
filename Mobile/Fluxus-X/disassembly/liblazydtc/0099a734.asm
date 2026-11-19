; std::__ndk1::function<void(unsigned_short,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long,bool)>::swap @ 0099a734
0099a734	sub sp,sp,#0x60
0099a738	str x21,[sp, #0x30]
0099a73c	stp x20,x19,[sp, #0x40]
0099a740	stp x29,x30,[sp, #0x50]
0099a744	add x29,sp,#0x50
0099a748	mrs x21,tpidr_el0
0099a74c	ldr x8,[x21, #0x28]
0099a750	mov x19,x1
0099a754	mov x20,x0
0099a758	cmp x1,x0
0099a75c	str x8,[sp, #0x28]
0099a760	b.eq 0x0099a86c
0099a764	ldr x0,[x20, #0x20]
0099a768	cmp x0,x20
0099a76c	b.eq 0x0099a788
0099a770	ldr x8,[x19, #0x20]
0099a774	cmp x19,x8
0099a778	b.eq 0x0099a7c0
0099a77c	str x8,[x20, #0x20]
0099a780	str x0,[x19, #0x20]
0099a784	b 0x0099a86c
0099a788	ldr x8,[x19, #0x20]
0099a78c	cmp x8,x19
0099a790	b.eq 0x0099a7f4
0099a794	ldr x8,[x0]
0099a798	ldr x8,[x8, #0x18]
0099a79c	mov x1,x19
0099a7a0	blr x8
0099a7a4	ldr x0,[x20, #0x20]
0099a7a8	ldr x8,[x0]
0099a7ac	ldr x8,[x8, #0x20]
0099a7b0	blr x8
0099a7b4	ldr x8,[x19, #0x20]
0099a7b8	str x8,[x20, #0x20]
0099a7bc	b 0x0099a868
0099a7c0	ldr x9,[x8]
0099a7c4	ldr x9,[x9, #0x18]
0099a7c8	mov x0,x8
0099a7cc	mov x1,x20
0099a7d0	blr x9
0099a7d4	ldr x0,[x19, #0x20]
0099a7d8	ldr x8,[x0]
0099a7dc	ldr x8,[x8, #0x20]
0099a7e0	blr x8
0099a7e4	ldr x8,[x20, #0x20]
0099a7e8	str x8,[x19, #0x20]
0099a7ec	str x20,[x20, #0x20]
0099a7f0	b 0x0099a86c
0099a7f4	ldr x8,[x0]
0099a7f8	ldr x8,[x8, #0x18]
0099a7fc	mov x1,sp
0099a800	blr x8
0099a804	ldr x0,[x20, #0x20]
0099a808	ldr x8,[x0]
0099a80c	ldr x8,[x8, #0x20]
0099a810	blr x8
0099a814	str xzr,[x20, #0x20]
0099a818	ldr x0,[x19, #0x20]
0099a81c	ldr x8,[x0]
0099a820	ldr x8,[x8, #0x18]
0099a824	mov x1,x20
0099a828	blr x8
0099a82c	ldr x0,[x19, #0x20]
0099a830	ldr x8,[x0]
0099a834	ldr x8,[x8, #0x20]
0099a838	blr x8
0099a83c	str xzr,[x19, #0x20]
0099a840	str x20,[x20, #0x20]
0099a844	ldr x8,[sp]
0099a848	ldr x8,[x8, #0x18]
0099a84c	mov x0,sp
0099a850	mov x1,x19
0099a854	blr x8
0099a858	ldr x8,[sp]
0099a85c	mov x0,sp
0099a860	ldr x8,[x8, #0x20]
0099a864	blr x8
0099a868	str x19,[x19, #0x20]
0099a86c	ldr x8,[x21, #0x28]
0099a870	ldr x9,[sp, #0x28]
0099a874	cmp x8,x9
0099a878	b.ne 0x0099a890
0099a87c	ldp x29,x30,[sp, #0x50]
0099a880	ldp x20,x19,[sp, #0x40]
0099a884	ldr x21,[sp, #0x30]
0099a888	add sp,sp,#0x60
0099a88c	ret
0099a890	bl 0x00c2fec0
