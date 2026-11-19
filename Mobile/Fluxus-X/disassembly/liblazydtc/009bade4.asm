; FUN_009bade4 @ 009bade4
009bade4	stp x20,x19,[sp, #-0x20]!
009bade8	stp x29,x30,[sp, #0x10]
009badec	mov x20,x0
009badf0	ldr x0,[x0, #0xa8]
009badf4	mov x19,x1
009badf8	add x29,sp,#0x10
009badfc	cbnz x0,0x009bae0c
009bae00	bl 0x00c34780
009bae04	str x0,[x20, #0xa8]
009bae08	cbz x0,0x009bae1c
009bae0c	ldp x29,x30,[sp, #0x10]
009bae10	mov x1,x19
009bae14	ldp x20,x19,[sp], #0x20
009bae18	b 0x00c34ef0
009bae1c	ldp x29,x30,[sp, #0x10]
009bae20	ldp x20,x19,[sp], #0x20
009bae24	ret
