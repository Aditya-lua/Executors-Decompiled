; FUN_009bac90 @ 009bac90
009bac90	stp x20,x19,[sp, #-0x20]!
009bac94	stp x29,x30,[sp, #0x10]
009bac98	mov x20,x0
009bac9c	ldr x0,[x0, #0xa8]
009baca0	mov x19,x1
009baca4	add x29,sp,#0x10
009baca8	cbnz x0,0x009bacb8
009bacac	bl 0x00c34780
009bacb0	str x0,[x20, #0xa8]
009bacb4	cbz x0,0x009bacc8
009bacb8	ldp x29,x30,[sp, #0x10]
009bacbc	mov x1,x19
009bacc0	ldp x20,x19,[sp], #0x20
009bacc4	b 0x00c34ee0
009bacc8	ldp x29,x30,[sp, #0x10]
009baccc	ldp x20,x19,[sp], #0x20
009bacd0	ret
