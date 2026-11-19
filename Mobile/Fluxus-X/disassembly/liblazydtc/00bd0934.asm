; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::readsome @ 00bd0934
00bd0934	paciasp
00bd0938	stp x29,x30,[sp, #-0x30]!
00bd093c	str x21,[sp, #0x10]
00bd0940	stp x20,x19,[sp, #0x20]
00bd0944	mov x29,sp
00bd0948	mov x19,x0
00bd094c	mov x21,x2
00bd0950	mov x20,x1
00bd0954	str xzr,[x0, #0x8]
00bd0958	add x0,x29,#0x1c
00bd095c	mov x1,x19
00bd0960	mov w2,#0x1
00bd0964	bl 0x00c30140
00bd0968	ldrb w8,[x29, #0x1c]
00bd096c	cmp w8,#0x1
00bd0970	b.ne 0x00bd0998
00bd0974	ldr x8,[x19]
00bd0978	ldur x8,[x8, #-0x18]
00bd097c	add x8,x19,x8
00bd0980	ldr x0,[x8, #0x28]
00bd0984	ldp x8,x9,[x0, #0x18]
00bd0988	cmp x8,x9
00bd098c	b.cs 0x00bd09a0
00bd0990	sub x0,x9,x8
00bd0994	b 0x00bd09ac
00bd0998	mov w8,#0x4
00bd099c	b 0x00bd0a08
00bd09a0	ldr x8,[x0]
00bd09a4	ldr x8,[x8, #0x38]
00bd09a8	blr x8
00bd09ac	cmn x0,#0x1
00bd09b0	b.eq 0x00bd09c0
00bd09b4	cbnz x0,0x00bd09c8
00bd09b8	mov w8,wzr
00bd09bc	b 0x00bd0a08
00bd09c0	mov w8,#0x2
00bd09c4	b 0x00bd0a08
00bd09c8	ldr x8,[x19]
00bd09cc	cmp x21,x0
00bd09d0	csel x21,x21,x0,lt
00bd09d4	ldur x8,[x8, #-0x18]
00bd09d8	add x8,x19,x8
00bd09dc	ldr x8,[x8, #0x28]
00bd09e0	ldr x9,[x8]
00bd09e4	ldr x9,[x9, #0x40]
00bd09e8	mov x0,x8
00bd09ec	mov x1,x20
00bd09f0	mov x2,x21
00bd09f4	blr x9
00bd09f8	cmp x0,x21
00bd09fc	mov w8,#0x6
00bd0a00	str x0,[x19, #0x8]
00bd0a04	csel w8,wzr,w8,eq
00bd0a08	ldr x9,[x19]
00bd0a0c	ldur x9,[x9, #-0x18]
00bd0a10	add x0,x19,x9
00bd0a14	ldr w9,[x0, #0x20]
00bd0a18	orr w1,w9,w8
00bd0a1c	bl 0x00c30130
00bd0a20	ldr x0,[x19, #0x8]
00bd0a24	ldp x20,x19,[sp, #0x20]
00bd0a28	ldr x21,[sp, #0x10]
00bd0a2c	ldp x29,x30,[sp], #0x30
00bd0a30	autiasp
00bd0a34	ret
