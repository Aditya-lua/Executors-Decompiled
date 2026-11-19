; FUN_00c17840 @ 00c17840
00c17840	paciasp
00c17844	stp x29,x30,[sp, #-0x40]!
00c17848	str x23,[sp, #0x10]
00c1784c	stp x22,x21,[sp, #0x20]
00c17850	stp x20,x19,[sp, #0x30]
00c17854	mov x29,sp
00c17858	ldr x23,[x0, #0x1330]
00c1785c	mov x20,x3
00c17860	mov x19,x2
00c17864	mov x21,x1
00c17868	ldr x8,[x23, #0x8]
00c1786c	sub x9,x8,#0xfc0
00c17870	cmn x9,#0xff1
00c17874	b.hi 0x00c17898
00c17878	mov x22,x0
00c1787c	mov w0,#0x1000
00c17880	bl 0x00c308d0
00c17884	cbz x0,0x00c178fc
00c17888	mov x8,xzr
00c1788c	stp x23,xzr,[x0]
00c17890	mov x23,x0
00c17894	str x0,[x22, #0x1330]
00c17898	add x9,x8,#0x30
00c1789c	add x0,x23,x8
00c178a0	adrp x8,0xcb1000
00c178a4	add x8,x8,#0xdd8
00c178a8	str x9,[x23, #0x8]
00c178ac	ldr x10,[x21]
00c178b0	str x8,[x0, #0x10]!
00c178b4	ldurh w8,[x0, #0x9]
00c178b8	ldrh w9,[x20]
00c178bc	mov w11,#0x44
00c178c0	str x10,[x0, #0x10]
00c178c4	and w8,w8,#0xf000
00c178c8	strb w11,[x0, #0x8]
00c178cc	bfxil w8,w9,#0x0,#0x6
00c178d0	mov w9,#0x540
00c178d4	ldr q0,[x19]
00c178d8	orr w8,w8,w9
00c178dc	sturh w8,[x0, #0x9]
00c178e0	stur q0,[x0, #0x18]
00c178e4	ldp x20,x19,[sp, #0x30]
00c178e8	ldr x23,[sp, #0x10]
00c178ec	ldp x22,x21,[sp, #0x20]
00c178f0	ldp x29,x30,[sp], #0x40
00c178f4	autiasp
00c178f8	ret
00c178fc	bl 0x00c2fff0
