; OBJ_create_objects @ 00aaea18
00aaea18	stp x28,x23,[sp, #-0x40]!
00aaea1c	stp x22,x21,[sp, #0x10]
00aaea20	stp x20,x19,[sp, #0x20]
00aaea24	stp x29,x30,[sp, #0x30]
00aaea28	add x29,sp,#0x30
00aaea2c	sub sp,sp,#0x200
00aaea30	mov x1,sp
00aaea34	mov w2,#0x200
00aaea38	mov x19,x0
00aaea3c	mov x23,sp
00aaea40	bl 0x00c38470
00aaea44	cmp w0,#0x1
00aaea48	b.lt 0x00aaeb54
00aaea4c	mov x22,xzr
00aaea50	mov w20,wzr
00aaea54	add x8,x23,w0, SXTW 
00aaea58	sturb wzr,[x8, #-0x1]
00aaea5c	ldrb w0,[sp]
00aaea60	orr w1,wzr,#0x7
00aaea64	bl 0x00c377c0
00aaea68	cbz w0,0x00aaeb58
00aaea6c	mov x21,sp
00aaea70	b 0x00aaea78
00aaea74	add x21,x21,#0x1
00aaea78	ldrb w0,[x21]
00aaea7c	bl 0x00c37770
00aaea80	cbnz w0,0x00aaea74
00aaea84	ldrb w8,[x21]
00aaea88	cmp w8,#0x2e
00aaea8c	b.eq 0x00aaea74
00aaea90	cbz w8,0x00aaead0
00aaea94	strb wzr,[x21]
00aaea98	ldrb w0,[x21, #0x1]!
00aaea9c	mov w1,#0x8
00aaeaa0	bl 0x00c377c0
00aaeaa4	cbnz w0,0x00aaea98
00aaeaa8	ldrb w8,[x21]
00aaeaac	cbz w8,0x00aaead0
00aaeab0	mov x22,x21
00aaeab4	and w0,w8,#0xff
00aaeab8	mov w1,#0x8
00aaeabc	bl 0x00c377c0
00aaeac0	cbnz w0,0x00aaeae0
00aaeac4	ldrb w8,[x22, #0x1]!
00aaeac8	cbnz w8,0x00aaeab4
00aaeacc	b 0x00aaeb14
00aaead0	mov x21,xzr
00aaead4	ldrb w8,[sp]
00aaead8	cbnz w8,0x00aaeb20
00aaeadc	b 0x00aaeb58
00aaeae0	ldrb w8,[x22]
00aaeae4	cbz w8,0x00aaeb14
00aaeae8	strb wzr,[x22]
00aaeaec	ldrb w0,[x22, #0x1]!
00aaeaf0	mov w1,#0x8
00aaeaf4	bl 0x00c377c0
00aaeaf8	cbnz w0,0x00aaeaec
00aaeafc	ldrb w8,[x22]
00aaeb00	cmp w8,#0x0
00aaeb04	csel x22,xzr,x22,eq
00aaeb08	ldrb w8,[sp]
00aaeb0c	cbnz w8,0x00aaeb20
00aaeb10	b 0x00aaeb58
00aaeb14	mov x22,xzr
00aaeb18	ldrb w8,[sp]
00aaeb1c	cbz w8,0x00aaeb58
00aaeb20	mov x0,sp
00aaeb24	mov x1,x21
00aaeb28	mov x2,x22
00aaeb2c	bl 0x00aaeb74
00aaeb30	cbz w0,0x00aaeb58
00aaeb34	mov x1,sp
00aaeb38	mov w2,#0x200
00aaeb3c	mov x0,x19
00aaeb40	add w20,w20,#0x1
00aaeb44	bl 0x00c38470
00aaeb48	cmp w0,#0x0
00aaeb4c	b.gt 0x00aaea54
00aaeb50	b 0x00aaeb58
00aaeb54	mov w20,wzr
00aaeb58	mov w0,w20
00aaeb5c	add sp,sp,#0x200
00aaeb60	ldp x29,x30,[sp, #0x30]
00aaeb64	ldp x20,x19,[sp, #0x20]
00aaeb68	ldp x22,x21,[sp, #0x10]
00aaeb6c	ldp x28,x23,[sp], #0x40
00aaeb70	ret
