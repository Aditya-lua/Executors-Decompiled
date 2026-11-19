; FUN_009bab0c @ 009bab0c
009bab0c	stp x20,x19,[sp, #-0x20]!
009bab10	stp x29,x30,[sp, #0x10]
009bab14	ldr x8,[x0, #0x18]
009bab18	mov x19,x1
009bab1c	add x29,sp,#0x10
009bab20	cbz x8,0x009bab2c
009bab24	add x8,x8,#0x158
009bab28	b 0x009bab38
009bab2c	ldr x8,[x0, #0x20]
009bab30	cbz x8,0x009bab60
009bab34	add x8,x8,#0x898
009bab38	ldr x20,[x8]
009bab3c	ldr x0,[x20, #0x1d0]
009bab40	cbnz x0,0x009bab50
009bab44	bl 0x00c35030
009bab48	str x0,[x20, #0x1d0]
009bab4c	cbz x0,0x009bab64
009bab50	cbz x19,0x009bab60
009bab54	mov x1,x19
009bab58	bl 0x00c32c30
009bab5c	cbz w0,0x009bab64
009bab60	mov w0,#0x1
009bab64	ldp x29,x30,[sp, #0x10]
009bab68	ldp x20,x19,[sp], #0x20
009bab6c	ret
