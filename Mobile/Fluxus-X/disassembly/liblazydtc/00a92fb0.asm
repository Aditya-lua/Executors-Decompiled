; FUN_00a92fb0 @ 00a92fb0
00a92fb0	sub sp,sp,#0x80
00a92fb4	stp x24,x23,[sp, #0x40]
00a92fb8	stp x22,x21,[sp, #0x50]
00a92fbc	stp x20,x19,[sp, #0x60]
00a92fc0	mov x20,x3
00a92fc4	mov x23,x2
00a92fc8	mov x21,x1
00a92fcc	lsr x8,x3,#0x1e
00a92fd0	mov x19,x0
00a92fd4	stp x28,x27,[sp, #0x20]
00a92fd8	stp x26,x25,[sp, #0x30]
00a92fdc	stp x29,x30,[sp, #0x70]
00a92fe0	add x29,sp,#0x70
00a92fe4	cbz x8,0x00a9306c
00a92fe8	orr x27,xzr,#-0x40000000
00a92fec	add x8,x20,x27
00a92ff0	and x28,x8,#-0x40000000
00a92ff4	mov w26,#0x40000000
00a92ff8	add x22,x28,x26
00a92ffc	add x24,x19,#0x28
00a93000	str x8,[sp, #0x8]
00a93004	add x8,x23,x22
00a93008	mov x25,x21
00a9300c	str x8,[sp, #0x10]
00a93010	mov x0,x19
00a93014	bl 0x00c3ceb0
00a93018	str w0,[sp, #0x1c]
00a9301c	mov x0,x19
00a93020	bl 0x00c3cea0
00a93024	mov x3,x0
00a93028	mov w2,#0x40000000
00a9302c	add x5,sp,#0x1c
00a93030	mov x0,x23
00a93034	mov x1,x25
00a93038	mov x4,x24
00a9303c	bl 0x00c39a50
00a93040	ldr w1,[sp, #0x1c]
00a93044	mov x0,x19
00a93048	bl 0x00c3ced0
00a9304c	add x20,x20,x27
00a93050	add x23,x23,x26
00a93054	lsr x8,x20,#0x1e
00a93058	add x25,x25,x26
00a9305c	cbnz x8,0x00a93010
00a93060	ldp x8,x23,[sp, #0x8]
00a93064	add x21,x21,x22
00a93068	sub x20,x8,x28
00a9306c	cbz x20,0x00a930ac
00a93070	mov x0,x19
00a93074	bl 0x00c3ceb0
00a93078	str w0,[sp, #0x18]
00a9307c	mov x0,x19
00a93080	bl 0x00c3cea0
00a93084	mov x3,x0
00a93088	add x4,x19,#0x28
00a9308c	add x5,sp,#0x18
00a93090	mov x0,x23
00a93094	mov x1,x21
00a93098	mov x2,x20
00a9309c	bl 0x00c39a50
00a930a0	ldr w1,[sp, #0x18]
00a930a4	mov x0,x19
00a930a8	bl 0x00c3ced0
00a930ac	ldp x29,x30,[sp, #0x70]
00a930b0	ldp x20,x19,[sp, #0x60]
00a930b4	ldp x22,x21,[sp, #0x50]
00a930b8	ldp x24,x23,[sp, #0x40]
00a930bc	ldp x26,x25,[sp, #0x30]
00a930c0	ldp x28,x27,[sp, #0x20]
00a930c4	mov w0,#0x1
00a930c8	add sp,sp,#0x80
00a930cc	ret
