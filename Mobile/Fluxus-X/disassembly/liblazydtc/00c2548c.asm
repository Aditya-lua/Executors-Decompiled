; FUN_00c2548c @ 00c2548c
00c2548c	paciasp
00c25490	stp x29,x30,[sp, #-0x30]!
00c25494	str x21,[sp, #0x10]
00c25498	stp x20,x19,[sp, #0x20]
00c2549c	mov x29,sp
00c254a0	ldr x21,[x0, #0x1330]
00c254a4	mov x19,x1
00c254a8	ldr x8,[x21, #0x8]
00c254ac	sub x9,x8,#0xfd0
00c254b0	cmn x9,#0xff1
00c254b4	b.hi 0x00c254d8
00c254b8	mov x20,x0
00c254bc	mov w0,#0x1000
00c254c0	bl 0x00c308d0
00c254c4	cbz x0,0x00c25534
00c254c8	mov x8,xzr
00c254cc	stp x21,xzr,[x0]
00c254d0	mov x21,x0
00c254d4	str x0,[x20, #0x1330]
00c254d8	add x9,x8,#0x20
00c254dc	mov x0,x19
00c254e0	add x20,x21,x8
00c254e4	str x9,[x21, #0x8]
00c254e8	bl 0x00c2ff50
00c254ec	adrp x9,0xcb1000
00c254f0	add x9,x9,#0x4c0
00c254f4	mov w11,#0x540
00c254f8	str x9,[x20, #0x10]!
00c254fc	ldurh w9,[x20, #0x9]
00c25500	mov x8,x0
00c25504	mov w10,#0x8
00c25508	and w9,w9,#0xf000
00c2550c	strb w10,[x20, #0x8]
00c25510	orr w9,w9,w11
00c25514	stp x19,x8,[x20, #0x10]
00c25518	sturh w9,[x20, #0x9]
00c2551c	mov x0,x20
00c25520	ldp x20,x19,[sp, #0x20]
00c25524	ldr x21,[sp, #0x10]
00c25528	ldp x29,x30,[sp], #0x30
00c2552c	autiasp
00c25530	ret
00c25534	bl 0x00c2fff0
