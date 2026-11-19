; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd47ec
00bd47ec	paciasp
00bd47f0	stp x29,x30,[sp, #-0x30]!
00bd47f4	str x21,[sp, #0x10]
00bd47f8	stp x20,x19,[sp, #0x20]
00bd47fc	mov x29,sp
00bd4800	ldr x8,[x0]
00bd4804	mov x19,x0
00bd4808	mov x20,x1
00bd480c	ldur x9,[x8, #-0x18]
00bd4810	add x8,x29,#0x18
00bd4814	add x0,x0,x9
00bd4818	bl 0x00c30070
00bd481c	adrp x1,0xcb5000
00bd4820	add x0,x29,#0x18
00bd4824	ldr x1,[x1, #0xb98]
00bd4828	bl 0x00c30080
00bd482c	ldr x8,[x0]
00bd4830	ldr x8,[x8, #0x58]
00bd4834	mov w1,#0xa
00bd4838	blr x8
00bd483c	mov w21,w0
00bd4840	add x0,x29,#0x18
00bd4844	bl 0x00c30090
00bd4848	mov x0,x19
00bd484c	mov x1,x20
00bd4850	mov w2,w21
00bd4854	bl 0x00c44090
00bd4858	ldp x20,x19,[sp, #0x20]
00bd485c	ldr x21,[sp, #0x10]
00bd4860	ldp x29,x30,[sp], #0x30
00bd4864	autiasp
00bd4868	ret
