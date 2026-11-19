; FUN_009b1b60 @ 009b1b60
009b1b60	str x19,[sp, #-0x20]!
009b1b64	stp x29,x30,[sp, #0x10]
009b1b68	mov x19,x0
009b1b6c	ldr x0,[x0, #0x848]
009b1b70	add x29,sp,#0x10
009b1b74	cbz x0,0x009b1b80
009b1b78	bl 0x00c342d0
009b1b7c	str xzr,[x19, #0x848]
009b1b80	ldr x0,[x19, #0x878]
009b1b84	cbz x0,0x009b1b90
009b1b88	bl 0x00c342d0
009b1b8c	str xzr,[x19, #0x878]
009b1b90	ldr x0,[x19, #0x870]
009b1b94	bl 0x00c34b60
009b1b98	ldr x0,[x19, #0x868]
009b1b9c	str xzr,[x19, #0x870]
009b1ba0	bl 0x00c34b60
009b1ba4	ldr x0,[x19, #0x860]
009b1ba8	str xzr,[x19, #0x868]
009b1bac	bl 0x00c31f90
009b1bb0	ldr x0,[x19, #0x890]
009b1bb4	str xzr,[x19, #0x860]
009b1bb8	bl 0x00c31f90
009b1bbc	str xzr,[x19, #0x890]
009b1bc0	ldp x29,x30,[sp, #0x10]
009b1bc4	ldr x19,[sp], #0x20
009b1bc8	ret
