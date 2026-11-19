; cpr::util::writeFunction @ 009007c8
009007c8	str x19,[sp, #-0x20]!
009007cc	stp x29,x30,[sp, #0x10]
009007d0	add x29,sp,#0x10
009007d4	mov x8,x0
009007d8	mul x19,x2,x1
009007dc	mov x0,x3
009007e0	mov x1,x8
009007e4	mov x2,x19
009007e8	bl 0x00c308c0
009007ec	ldp x29,x30,[sp, #0x10]
009007f0	mov x0,x19
009007f4	ldr x19,[sp], #0x20
009007f8	ret
