; FUN_007fcb88 @ 007fcb88
007fcb88	cbz x0,0x007fcbd0
007fcb8c	stp x29,x30,[sp, #-0x30]!
007fcb90	str x21,[sp, #0x10]
007fcb94	stp x20,x19,[sp, #0x20]
007fcb98	mov x29,sp
007fcb9c	ldr x20,[x0, #0x10]
007fcba0	mov w8,wzr
007fcba4	cbz x20,0x007fcc78
007fcba8	adrp x9,0xcca000
007fcbac	ldr x9,[x9, #0x938]
007fcbb0	ldr x9,[x9, #0x10]
007fcbb4	cbz x9,0x007fcc78
007fcbb8	ldr x8,[x0, #0x60]
007fcbbc	ldr x9,[x9, #0x60]
007fcbc0	cmp x8,x9
007fcbc4	b.eq 0x007fcbd8
007fcbc8	mov w8,wzr
007fcbcc	b 0x007fcc78
007fcbd0	mov w0,wzr
007fcbd4	ret
007fcbd8	ldr x8,[x20, #0x38]
007fcbdc	cbz x8,0x007fcc0c
007fcbe0	mov x21,x0
007fcbe4	mov x0,x8
007fcbe8	bl 0x00c2fef0
007fcbec	mov x19,x0
007fcbf0	cbz x0,0x007fcc04
007fcbf4	ldr x8,[x20, #0x30]
007fcbf8	cbz x8,0x007fcc04
007fcbfc	mov w8,wzr
007fcc00	b 0x007fcc48
007fcc04	mov x0,x21
007fcc08	b 0x007fcc10
007fcc0c	mov x19,xzr
007fcc10	ldr x8,[x0, #0x10]
007fcc14	ldr x9,[x8, #0x38]
007fcc18	cbz x9,0x007fcc30
007fcc1c	ldr x9,[x9, #0x8]
007fcc20	cmn x9,#0x1
007fcc24	b.eq 0x007fcc30
007fcc28	mov w8,wzr
007fcc2c	b 0x007fcc44
007fcc30	adrp x9,0xcc4000
007fcc34	ldr x8,[x8, #0x98]
007fcc38	ldr x9,[x9, #0x430]
007fcc3c	bics xzr,x9,x8
007fcc40	cset w8,eq
007fcc44	cbz x19,0x007fcc78
007fcc48	add x1,x19,#0x8
007fcc4c	mov x0,#-0x1
007fcc50	mov w20,w8
007fcc54	bl 0x00c2bd10
007fcc58	cbnz x0,0x007fcc74
007fcc5c	ldr x8,[x19]
007fcc60	mov x0,x19
007fcc64	ldr x8,[x8, #0x10]
007fcc68	blr x8
007fcc6c	mov x0,x19
007fcc70	bl 0x00c2ff00
007fcc74	mov w8,w20
007fcc78	ldp x20,x19,[sp, #0x20]
007fcc7c	ldr x21,[sp, #0x10]
007fcc80	ldp x29,x30,[sp], #0x30
007fcc84	mov w0,w8
007fcc88	ret
