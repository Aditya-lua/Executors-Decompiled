; MDC2_Update @ 00aa6f94
00aa6f94	str x23,[sp, #-0x40]!
00aa6f98	stp x22,x21,[sp, #0x10]
00aa6f9c	stp x20,x19,[sp, #0x20]
00aa6fa0	stp x29,x30,[sp, #0x30]
00aa6fa4	ldr w23,[x0]
00aa6fa8	mov x20,x2
00aa6fac	mov x19,x0
00aa6fb0	mov x21,x1
00aa6fb4	add x29,sp,#0x30
00aa6fb8	cbz w23,0x00aa7010
00aa6fbc	mov w8,#0x8
00aa6fc0	sub x22,x8,x23
00aa6fc4	add x8,x19,x23
00aa6fc8	cmp x22,x20
00aa6fcc	add x0,x8,#0x4
00aa6fd0	b.ls 0x00aa6fe8
00aa6fd4	mov x1,x21
00aa6fd8	mov x2,x20
00aa6fdc	bl 0x00c2ffd0
00aa6fe0	add w20,w23,w20
00aa6fe4	b 0x00aa7040
00aa6fe8	mov x1,x21
00aa6fec	mov x2,x22
00aa6ff0	bl 0x00c2ffd0
00aa6ff4	mov x1,x19
00aa6ff8	str wzr,[x1], #0x4
00aa6ffc	mov w2,#0x8
00aa7000	mov x0,x19
00aa7004	sub x20,x20,x22
00aa7008	add x21,x21,x22
00aa700c	bl 0x00aa705c
00aa7010	ands x22,x20,#-0x8
00aa7014	b.eq 0x00aa7028
00aa7018	mov x0,x19
00aa701c	mov x1,x21
00aa7020	mov x2,x22
00aa7024	bl 0x00aa705c
00aa7028	subs x20,x20,x22
00aa702c	b.eq 0x00aa7044
00aa7030	add x0,x19,#0x4
00aa7034	add x1,x21,x22
00aa7038	mov x2,x20
00aa703c	bl 0x00c2ffd0
00aa7040	str w20,[x19]
00aa7044	ldp x29,x30,[sp, #0x30]
00aa7048	ldp x20,x19,[sp, #0x20]
00aa704c	ldp x22,x21,[sp, #0x10]
00aa7050	mov w0,#0x1
00aa7054	ldr x23,[sp], #0x40
00aa7058	ret
