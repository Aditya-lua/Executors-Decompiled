; FUN_009bad18 @ 009bad18
009bad18	stp x20,x19,[sp, #-0x20]!
009bad1c	stp x29,x30,[sp, #0x10]
009bad20	mov x20,x0
009bad24	ldr x0,[x0, #0xa8]
009bad28	mov x19,x1
009bad2c	add x29,sp,#0x10
009bad30	cbnz x0,0x009bad40
009bad34	bl 0x00c34780
009bad38	str x0,[x20, #0xa8]
009bad3c	cbz x0,0x009bad50
009bad40	ldp x29,x30,[sp, #0x10]
009bad44	mov x1,x19
009bad48	ldp x20,x19,[sp], #0x20
009bad4c	b 0x00c34ed0
009bad50	ldp x29,x30,[sp, #0x10]
009bad54	ldp x20,x19,[sp], #0x20
009bad58	ret
