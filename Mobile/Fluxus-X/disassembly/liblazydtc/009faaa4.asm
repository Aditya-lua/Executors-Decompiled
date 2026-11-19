; FUN_009faaa4 @ 009faaa4
009faaa4	stp x20,x19,[sp, #-0x20]!
009faaa8	adrp x1,0x29d000
009faaac	mov x19,x0
009faab0	add x1,x1,#0xf58
009faab4	mov w0,#0x10
009faab8	mov w2,#0x36
009faabc	stp x29,x30,[sp, #0x10]
009faac0	add x29,sp,#0x10
009faac4	bl 0x00c34250
009faac8	cbz x0,0x009faafc
009faacc	adrp x8,0x29b000
009faad0	ldr d0,[x8, #0x470]
009faad4	mov x1,x0
009faad8	str xzr,[x0]
009faadc	str d0,[x0, #0x8]
009faae0	mov x0,x19
009faae4	bl 0x00c32290
009faae8	mov w1,#0x1
009faaec	mov x0,x19
009faaf0	mov w20,#0x1
009faaf4	bl 0x00c322b0
009faaf8	b 0x009fab00
009faafc	mov w20,wzr
009fab00	ldp x29,x30,[sp, #0x10]
009fab04	mov w0,w20
009fab08	ldp x20,x19,[sp], #0x20
009fab0c	ret
