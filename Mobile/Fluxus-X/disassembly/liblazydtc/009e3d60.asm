; ssl3_take_mac @ 009e3d60
009e3d60	str x19,[sp, #-0x20]!
009e3d64	stp x29,x30,[sp, #0x10]
009e3d68	ldr x9,[x0, #0x8]
009e3d6c	ldr w8,[x0, #0x38]
009e3d70	orr w10,wzr,#0x30
009e3d74	mov w11,#0x40
009e3d78	ldr x9,[x9, #0xc0]
009e3d7c	orr w12,wzr,#0x38
009e3d80	mov w13,#0x48
009e3d84	cmp w8,#0x0
009e3d88	csel x8,x11,x10,eq
009e3d8c	csel x10,x13,x12,eq
009e3d90	ldr x2,[x9, x10#0x0]
009e3d94	ldr x1,[x9, x8#0x0]
009e3d98	ldr x8,[x9, #0x28]
009e3d9c	add x3,x0,#0x248
009e3da0	add x29,sp,#0x10
009e3da4	mov x19,x0
009e3da8	blr x8
009e3dac	str x0,[x19, #0x2c8]
009e3db0	ldp x29,x30,[sp, #0x10]
009e3db4	cmp x0,#0x0
009e3db8	cset w8,ne
009e3dbc	mov w0,w8
009e3dc0	ldr x19,[sp], #0x20
009e3dc4	ret
