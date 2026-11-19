; FUN_00abec10 @ 00abec10
00abec10	sub sp,sp,#0x60
00abec14	stp x26,x25,[sp, #0x10]
00abec18	stp x24,x23,[sp, #0x20]
00abec1c	stp x22,x21,[sp, #0x30]
00abec20	stp x20,x19,[sp, #0x40]
00abec24	stp x29,x30,[sp, #0x50]
00abec28	ldr x8,[x4]
00abec2c	ldr w26,[x3]
00abec30	mov x20,x4
00abec34	mov x22,x3
00abec38	mov w19,w2
00abec3c	mov x23,x1
00abec40	mov x21,x0
00abec44	add x29,sp,#0x50
00abec48	tbnz w8,#0x7,0x00abec5c
00abec4c	mov x24,xzr
00abec50	mov x25,xzr
00abec54	tbz w8,#0x6,0x00abec74
00abec58	b 0x00abec78
00abec5c	ldr x8,[x22, #0x20]
00abec60	blr x8
00abec64	ldr x24,[x0, #0x30]
00abec68	ldr x8,[x20]
00abec6c	mov x25,xzr
00abec70	tbnz w8,#0x6,0x00abec78
00abec74	ldr x25,[x22, #0x18]
00abec78	tbnz w26,#0xc,0x00abecb8
00abec7c	tst w26,#0x6
00abec80	b.eq 0x00abecc8
00abec84	cbz x25,0x00abed38
00abec88	tbnz w8,#0x2,0x00abecf8
00abec8c	adrp x1,0x2b8000
00abec90	adrp x3,0x2ab000
00abec94	add x1,x1,#0x588
00abec98	add x3,x3,#0x32c
00abec9c	mov x0,x21
00abeca0	mov w2,w19
00abeca4	mov x4,x25
00abeca8	bl 0x00c32250
00abecac	cmp w0,#0x1
00abecb0	b.ge 0x00abed38
00abecb4	b 0x00abee44
00abecb8	str x23,[sp, #0x8]
00abecbc	add x23,sp,#0x8
00abecc0	tst w26,#0x6
00abecc4	b.ne 0x00abec84
00abecc8	ldr x8,[x22, #0x20]
00abeccc	blr x8
00abecd0	mov x3,x0
00abecd4	mov x0,x21
00abecd8	mov x1,x23
00abecdc	mov w2,w19
00abece0	mov x4,x25
00abece4	mov x5,x24
00abece8	mov w6,wzr
00abecec	mov x7,x20
00abecf0	bl 0x00abe428
00abecf4	b 0x00abee48
00abecf8	ldr x5,[x22, #0x18]
00abecfc	adrp x8,0x2bb000
00abed00	adrp x9,0x29d000
00abed04	add x8,x8,#0x970
00abed08	add x9,x9,#0xf13
00abed0c	tst w26,#0x2
00abed10	adrp x1,0x2b0000
00abed14	adrp x3,0x2ab000
00abed18	csel x4,x9,x8,eq
00abed1c	add x1,x1,#0x7aa
00abed20	add x3,x3,#0x32c
00abed24	mov x0,x21
00abed28	mov w2,w19
00abed2c	bl 0x00c32250
00abed30	cmp w0,#0x1
00abed34	b.lt 0x00abee44
00abed38	ldr x23,[x23]
00abed3c	mov x0,x23
00abed40	bl 0x00c325e0
00abed44	cmp w0,#0x1
00abed48	b.lt 0x00abedd4
00abed4c	adrp x26,0x2c4000
00abed50	mov w24,wzr
00abed54	add w25,w19,#0x2
00abed58	mov w8,#0x1
00abed5c	add x26,x26,#0xdae
00abed60	tbnz w8,#0x0,0x00abed78
00abed64	mov x0,x21
00abed68	mov x1,x26
00abed6c	bl 0x00c32260
00abed70	cmp w0,#0x1
00abed74	b.lt 0x00abee44
00abed78	mov x0,x23
00abed7c	mov w1,w24
00abed80	bl 0x00c32610
00abed84	str x0,[sp]
00abed88	ldr x8,[x22, #0x20]
00abed8c	blr x8
00abed90	mov x3,x0
00abed94	mov x1,sp
00abed98	mov w6,#0x1
00abed9c	mov x0,x21
00abeda0	mov w2,w25
00abeda4	mov x4,xzr
00abeda8	mov x5,xzr
00abedac	mov x7,x20
00abedb0	bl 0x00abe428
00abedb4	cbz w0,0x00abee48
00abedb8	mov x0,x23
00abedbc	add w24,w24,#0x1
00abedc0	bl 0x00c325e0
00abedc4	cmp w24,w0
00abedc8	mov w8,wzr
00abedcc	b.lt 0x00abed60
00abedd0	b 0x00abee10
00abedd4	adrp x8,0x2c3000
00abedd8	adrp x9,0x2b8000
00abeddc	add x8,x8,#0x8be
00abede0	add x9,x9,#0x590
00abede4	cmp x23,#0x0
00abede8	adrp x1,0x2ca000
00abedec	adrp x3,0x2ab000
00abedf0	add w2,w19,#0x2
00abedf4	csel x4,x9,x8,eq
00abedf8	add x1,x1,#0x286
00abedfc	add x3,x3,#0x32c
00abee00	mov x0,x21
00abee04	bl 0x00c32250
00abee08	cmp w0,#0x1
00abee0c	b.lt 0x00abee44
00abee10	ldrb w8,[x20]
00abee14	tbz w8,#0x1,0x00abee3c
00abee18	adrp x1,0x2da000
00abee1c	adrp x3,0x2ab000
00abee20	add x1,x1,#0x54e
00abee24	add x3,x3,#0x32c
00abee28	mov x0,x21
00abee2c	mov w2,w19
00abee30	bl 0x00c32250
00abee34	cmp w0,#0x1
00abee38	b.lt 0x00abee44
00abee3c	mov w0,#0x1
00abee40	b 0x00abee48
00abee44	mov w0,wzr
00abee48	ldp x29,x30,[sp, #0x50]
00abee4c	ldp x20,x19,[sp, #0x40]
00abee50	ldp x22,x21,[sp, #0x30]
00abee54	ldp x24,x23,[sp, #0x20]
00abee58	ldp x26,x25,[sp, #0x10]
00abee5c	add sp,sp,#0x60
00abee60	ret
