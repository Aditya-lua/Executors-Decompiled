; FUN_009fa920 @ 009fa920
009fa920	stp x20,x19,[sp, #-0x20]!
009fa924	mov x20,x0
009fa928	mov x0,x1
009fa92c	stp x29,x30,[sp, #0x10]
009fa930	add x29,sp,#0x10
009fa934	mov x19,x1
009fa938	bl 0x00c2ff50
009fa93c	ldp x29,x30,[sp, #0x10]
009fa940	mov x2,x0
009fa944	mov x0,x20
009fa948	mov x1,x19
009fa94c	ldp x20,x19,[sp], #0x20
009fa950	b 0x00c34240
