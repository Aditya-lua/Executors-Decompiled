; ossl_policy_level_find_node @ 00b139bc
00b139bc	str x23,[sp, #-0x40]!
00b139c0	stp x22,x21,[sp, #0x10]
00b139c4	stp x20,x19,[sp, #0x20]
00b139c8	stp x29,x30,[sp, #0x30]
00b139cc	mov x20,x0
00b139d0	ldr x0,[x0, #0x8]
00b139d4	add x29,sp,#0x30
00b139d8	mov x19,x2
00b139dc	mov x21,x1
00b139e0	bl 0x00c325e0
00b139e4	cmp w0,#0x1
00b139e8	b.lt 0x00b13a34
00b139ec	mov w22,wzr
00b139f0	ldr x0,[x20, #0x8]
00b139f4	mov w1,w22
00b139f8	bl 0x00c32610
00b139fc	ldr x8,[x0, #0x8]
00b13a00	cmp x8,x21
00b13a04	b.ne 0x00b13a20
00b13a08	ldr x8,[x0]
00b13a0c	mov x23,x0
00b13a10	mov x1,x19
00b13a14	ldr x0,[x8, #0x8]
00b13a18	bl 0x00c37ab0
00b13a1c	cbz w0,0x00b13a38
00b13a20	ldr x0,[x20, #0x8]
00b13a24	add w22,w22,#0x1
00b13a28	bl 0x00c325e0
00b13a2c	cmp w22,w0
00b13a30	b.lt 0x00b139f0
00b13a34	mov x23,xzr
00b13a38	ldp x29,x30,[sp, #0x30]
00b13a3c	ldp x20,x19,[sp, #0x20]
00b13a40	ldp x22,x21,[sp, #0x10]
00b13a44	mov x0,x23
00b13a48	ldr x23,[sp], #0x40
00b13a4c	ret
