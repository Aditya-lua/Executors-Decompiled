; FUN_008e3a8c @ 008e3a8c
008e3a8c	stp x30,x23,[sp, #-0x30]!
008e3a90	stp x22,x21,[sp, #0x10]
008e3a94	stp x20,x19,[sp, #0x20]
008e3a98	mov x19,x2
008e3a9c	and x2,x2,#0xffff
008e3aa0	mov w3,wzr
008e3aa4	mov x20,x1
008e3aa8	mov x21,x0
008e3aac	ubfx x22,x19,#0x20,#0x10
008e3ab0	lsr x23,x19,#0x30
008e3ab4	bl 0x008e3e3c
008e3ab8	ubfx x2,x19,#0x10,#0x10
008e3abc	mov w3,#0x10
008e3ac0	mov x0,x21
008e3ac4	mov x1,x20
008e3ac8	bl 0x008e3e78
008e3acc	mov w3,#0x20
008e3ad0	mov x0,x21
008e3ad4	mov x1,x20
008e3ad8	mov x2,x22
008e3adc	bl 0x008e3e78
008e3ae0	mov x0,x21
008e3ae4	mov x1,x20
008e3ae8	ldp x20,x19,[sp, #0x20]
008e3aec	ldp x22,x21,[sp, #0x10]
008e3af0	mov w3,#0x30
008e3af4	mov x2,x23
008e3af8	ldp x30,x23,[sp], #0x30
008e3afc	b 0x008e3e78
