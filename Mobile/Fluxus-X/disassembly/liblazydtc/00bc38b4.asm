; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__grow_by_and_replace @ 00bc38b4
00bc38b4	paciasp
00bc38b8	stp x29,x30,[sp, #-0x60]!
00bc38bc	stp x28,x27,[sp, #0x10]
00bc38c0	stp x26,x25,[sp, #0x20]
00bc38c4	stp x24,x23,[sp, #0x30]
00bc38c8	stp x22,x21,[sp, #0x40]
00bc38cc	stp x20,x19,[sp, #0x50]
00bc38d0	mov x29,sp
00bc38d4	mov x8,#-0xa
00bc38d8	sub x8,x8,x1
00bc38dc	cmp x2,x8
00bc38e0	b.hi 0x00bc39f8
00bc38e4	ldrb w8,[x0]
00bc38e8	ldr x9,[x0, #0x10]
00bc38ec	mov x26,x7
00bc38f0	mov x19,x6
00bc38f4	mov x23,x5
00bc38f8	mov x22,x1
00bc38fc	tst w8,#0x1
00bc3900	mov x8,#-0xe
00bc3904	mov x20,x4
00bc3908	movk x8,#0x7fff, LSL #48
00bc390c	mov x25,x3
00bc3910	mov x21,x0
00bc3914	csinc x24,x9,x0,ne
00bc3918	cmp x1,x8
00bc391c	b.hi 0x00bc3950
00bc3920	lsl x8,x22,#0x1
00bc3924	add x9,x2,x22
00bc3928	mov w10,#0x1a
00bc392c	cmp x9,x8
00bc3930	csel x8,x9,x8,hi
00bc3934	orr x9,x8,#0x7
00bc3938	cmp x9,#0x17
00bc393c	csinc x9,x10,x9,eq
00bc3940	cmp x8,#0x17
00bc3944	mov w8,#0x17
00bc3948	csel x27,x8,x9,cc
00bc394c	b 0x00bc3954
00bc3950	mov x27,#-0x9
00bc3954	mov x0,x27
00bc3958	bl 0x00c2fed0
00bc395c	mov x28,x0
00bc3960	cbz x20,0x00bc3974
00bc3964	mov x0,x28
00bc3968	mov x1,x24
00bc396c	mov x2,x20
00bc3970	bl 0x00c2ff60
00bc3974	cbz x19,0x00bc3988
00bc3978	add x0,x28,x20
00bc397c	mov x1,x26
00bc3980	mov x2,x19
00bc3984	bl 0x00c2ffd0
00bc3988	add x8,x23,x20
00bc398c	subs x25,x25,x8
00bc3990	b.eq 0x00bc39ac
00bc3994	add x8,x28,x20
00bc3998	add x9,x24,x20
00bc399c	mov x2,x25
00bc39a0	add x0,x8,x19
00bc39a4	add x1,x9,x23
00bc39a8	bl 0x00c2ff60
00bc39ac	add x1,x22,#0x1
00bc39b0	cmp x1,#0x17
00bc39b4	b.eq 0x00bc39c0
00bc39b8	mov x0,x24
00bc39bc	bl 0x00c2fe80
00bc39c0	add x9,x19,x20
00bc39c4	orr x8,x27,#0x1
00bc39c8	add x9,x9,x25
00bc39cc	str x8,[x21]
00bc39d0	stp x9,x28,[x21, #0x8]
00bc39d4	strb wzr,[x28, x9]
00bc39d8	ldp x20,x19,[sp, #0x50]
00bc39dc	ldp x22,x21,[sp, #0x40]
00bc39e0	ldp x24,x23,[sp, #0x30]
00bc39e4	ldp x26,x25,[sp, #0x20]
00bc39e8	ldp x28,x27,[sp, #0x10]
00bc39ec	ldp x29,x30,[sp], #0x60
00bc39f0	autiasp
00bc39f4	ret
00bc39f8	bl 0x007fe124
