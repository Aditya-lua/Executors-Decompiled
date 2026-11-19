; FUN_00aef928 @ 00aef928
00aef928	stp x22,x21,[sp, #-0x30]!
00aef92c	stp x20,x19,[sp, #0x10]
00aef930	mov x20,x0
00aef934	mov x0,x1
00aef938	stp x29,x30,[sp, #0x20]
00aef93c	add x29,sp,#0x20
00aef940	mov x19,x1
00aef944	bl 0x00c32aa0
00aef948	cmp w0,#0x1
00aef94c	b.eq 0x00aef9a8
00aef950	cmp w0,#0x2
00aef954	b.eq 0x00aef9ec
00aef958	cmp w0,#0x3
00aef95c	b.ne 0x00aefa88
00aef960	mov x0,x19
00aef964	bl 0x00c40360
00aef968	adrp x21,0xd22000
00aef96c	ldr x1,[x21, #0x330]
00aef970	bl 0x00c32dd0
00aef974	mov x0,x19
00aef978	bl 0x00c40350
00aef97c	ldr x1,[x21, #0x330]
00aef980	bl 0x00c32dd0
00aef984	ldr x0,[x21, #0x330]
00aef988	bl 0x00c30c50
00aef98c	mov x0,x19
00aef990	bl 0x00c32a90
00aef994	and w2,w0,#0x1
00aef998	mov x0,x20
00aef99c	mov x1,x19
00aef9a0	mov w3,wzr
00aef9a4	b 0x00aef9dc
00aef9a8	mov x0,x19
00aef9ac	bl 0x00c40360
00aef9b0	adrp x21,0xd22000
00aef9b4	ldr x1,[x21, #0x330]
00aef9b8	bl 0x00c32dd0
00aef9bc	ldr x0,[x21, #0x330]
00aef9c0	bl 0x00c30c50
00aef9c4	mov x0,x19
00aef9c8	bl 0x00c32a90
00aef9cc	and w2,w0,#0x1
00aef9d0	mov w3,#0x1
00aef9d4	mov x0,x20
00aef9d8	mov x1,x19
00aef9dc	ldp x29,x30,[sp, #0x20]
00aef9e0	ldp x20,x19,[sp, #0x10]
00aef9e4	ldp x22,x21,[sp], #0x30
00aef9e8	b 0x00aefafc
00aef9ec	adrp x22,0xd22000
00aef9f0	ldr x21,[x22, #0x330]
00aef9f4	mov x0,x19
00aef9f8	bl 0x00c40360
00aef9fc	adrp x1,0x2b8000
00aefa00	mov x2,x0
00aefa04	add x1,x1,#0x6a6
00aefa08	mov x0,x21
00aefa0c	bl 0x00c30940
00aefa10	ldr x0,[x22, #0x330]
00aefa14	bl 0x00c30c50
00aefa18	mov x0,x19
00aefa1c	bl 0x00c32a90
00aefa20	and w2,w0,#0x1
00aefa24	mov w3,#0x1
00aefa28	mov x0,x20
00aefa2c	mov x1,x19
00aefa30	bl 0x00aefafc
00aefa34	cmp w0,#0x1
00aefa38	b.lt 0x00aefa8c
00aefa3c	mov x0,x19
00aefa40	bl 0x00c40370
00aefa44	mov x20,x0
00aefa48	mov x0,x19
00aefa4c	bl 0x00c40380
00aefa50	mov x1,x0
00aefa54	mov x0,x20
00aefa58	bl 0x00c301f0
00aefa5c	cbz w0,0x00aefa88
00aefa60	ldr x3,[x22, #0x330]
00aefa64	adrp x0,0x2d4000
00aefa68	add x0,x0,#0x477
00aefa6c	orr w1,wzr,#0xf
00aefa70	mov w2,#0x1
00aefa74	bl 0x00c308f0
00aefa78	ldr x0,[x22, #0x330]
00aefa7c	bl 0x00c30c50
00aefa80	mov w0,wzr
00aefa84	b 0x00aefa8c
00aefa88	mov w0,#0x1
00aefa8c	ldp x29,x30,[sp, #0x20]
00aefa90	ldp x20,x19,[sp, #0x10]
00aefa94	ldp x22,x21,[sp], #0x30
00aefa98	ret
