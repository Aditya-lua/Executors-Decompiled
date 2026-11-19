; TXT_DB_create_index @ 00aed134
00aed134	str x25,[sp, #-0x50]!
00aed138	stp x24,x23,[sp, #0x10]
00aed13c	stp x22,x21,[sp, #0x20]
00aed140	stp x20,x19,[sp, #0x30]
00aed144	stp x29,x30,[sp, #0x40]
00aed148	ldr w8,[x0]
00aed14c	mov x19,x0
00aed150	mov w22,w1
00aed154	add x29,sp,#0x40
00aed158	cmp w8,w1
00aed15c	b.le 0x00aed204
00aed160	mov x0,x3
00aed164	mov x1,x4
00aed168	mov x21,x2
00aed16c	bl 0x00c34dd0
00aed170	cbz x0,0x00aed214
00aed174	mov x20,x0
00aed178	ldr x0,[x19, #0x8]
00aed17c	bl 0x00c325e0
00aed180	cmp w0,#0x1
00aed184	b.lt 0x00aed1dc
00aed188	mov w24,w0
00aed18c	mov x23,xzr
00aed190	ldr x0,[x19, #0x8]
00aed194	mov w1,w23
00aed198	bl 0x00c32610
00aed19c	mov x25,x0
00aed1a0	cbz x21,0x00aed1b0
00aed1a4	mov x0,x25
00aed1a8	blr x21
00aed1ac	cbz w0,0x00aed1d0
00aed1b0	mov x0,x20
00aed1b4	mov x1,x25
00aed1b8	bl 0x00c34dc0
00aed1bc	cbnz x0,0x00aed220
00aed1c0	mov x0,x20
00aed1c4	mov x1,x25
00aed1c8	bl 0x00c34de0
00aed1cc	cbz x0,0x00aed240
00aed1d0	add x23,x23,#0x1
00aed1d4	cmp w23,w24
00aed1d8	b.lt 0x00aed190
00aed1dc	ldr x8,[x19, #0x10]
00aed1e0	sbfiz x22,x22,#0x3,#0x20
00aed1e4	ldr x0,[x8, x22#0x0]
00aed1e8	bl 0x00c34db0
00aed1ec	ldr x8,[x19, #0x10]
00aed1f0	mov w0,#0x1
00aed1f4	str x20,[x8, x22#0x0]
00aed1f8	ldr x8,[x19, #0x18]
00aed1fc	str x21,[x8, x22#0x0]
00aed200	b 0x00aed254
00aed204	orr w8,wzr,#0x3
00aed208	mov w0,wzr
00aed20c	str x8,[x19, #0x20]
00aed210	b 0x00aed254
00aed214	mov w8,#0x1
00aed218	str x8,[x19, #0x20]
00aed21c	b 0x00aed254
00aed220	mov x1,x0
00aed224	ldr x0,[x19, #0x8]
00aed228	mov w8,#0x2
00aed22c	str x8,[x19, #0x20]
00aed230	bl 0x00c34760
00aed234	sxtw x8,w0
00aed238	stp x8,x23,[x19, #0x28]
00aed23c	b 0x00aed248
00aed240	mov w8,#0x1
00aed244	str x8,[x19, #0x20]
00aed248	mov x0,x20
00aed24c	bl 0x00c34db0
00aed250	mov w0,wzr
00aed254	ldp x29,x30,[sp, #0x40]
00aed258	ldp x20,x19,[sp, #0x30]
00aed25c	ldp x22,x21,[sp, #0x20]
00aed260	ldp x24,x23,[sp, #0x10]
00aed264	ldr x25,[sp], #0x50
00aed268	ret
