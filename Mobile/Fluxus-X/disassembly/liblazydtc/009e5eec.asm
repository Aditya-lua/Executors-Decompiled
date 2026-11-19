; get_ca_names @ 009e5eec
009e5eec	stp x20,x19,[sp, #-0x20]!
009e5ef0	stp x29,x30,[sp, #0x10]
009e5ef4	ldr w8,[x0, #0x38]
009e5ef8	mov x19,x0
009e5efc	add x29,sp,#0x10
009e5f00	cbz w8,0x009e5f2c
009e5f04	mov x0,x19
009e5f08	bl 0x00c34f10
009e5f0c	cbz x0,0x009e5f2c
009e5f10	mov x20,x0
009e5f14	bl 0x00c325e0
009e5f18	cbz w0,0x009e5f2c
009e5f1c	ldp x29,x30,[sp, #0x10]
009e5f20	mov x0,x20
009e5f24	ldp x20,x19,[sp], #0x20
009e5f28	ret
009e5f2c	ldp x29,x30,[sp, #0x10]
009e5f30	mov x0,x19
009e5f34	ldp x20,x19,[sp], #0x20
009e5f38	b 0x00c34f00
