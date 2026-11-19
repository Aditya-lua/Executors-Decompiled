; FUN_009bada0 @ 009bada0
009bada0	stp x20,x19,[sp, #-0x20]!
009bada4	stp x29,x30,[sp, #0x10]
009bada8	mov x20,x0
009badac	ldr x0,[x0, #0xa8]
009badb0	mov x19,x1
009badb4	add x29,sp,#0x10
009badb8	cbnz x0,0x009badc8
009badbc	bl 0x00c34780
009badc0	str x0,[x20, #0xa8]
009badc4	cbz x0,0x009badd8
009badc8	ldp x29,x30,[sp, #0x10]
009badcc	mov x1,x19
009badd0	ldp x20,x19,[sp], #0x20
009badd4	b 0x00c34ef0
009badd8	ldp x29,x30,[sp, #0x10]
009baddc	ldp x20,x19,[sp], #0x20
009bade0	ret
