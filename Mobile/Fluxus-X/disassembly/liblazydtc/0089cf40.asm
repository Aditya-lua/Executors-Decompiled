; FUN_0089cf40 @ 0089cf40
0089cf40	stp x29,x30,[sp, #-0x40]!
0089cf44	stp x24,x23,[sp, #0x10]
0089cf48	stp x22,x21,[sp, #0x20]
0089cf4c	stp x20,x19,[sp, #0x30]
0089cf50	mov x29,sp
0089cf54	ldr x20,[x0]
0089cf58	ldr x21,[x20]
0089cf5c	cbz x21,0x0089cff4
0089cf60	ldr x22,[x20, #0x8]
0089cf64	mov x19,x0
0089cf68	mov x0,x21
0089cf6c	mov x8,x20
0089cf70	cmp x21,x22
0089cf74	b.eq 0x0089cfd4
0089cf78	mov w23,#0x40
0089cf7c	mov x24,x22
0089cf80	b 0x0089cf98
0089cf84	ldur x0,[x22, #-0x20]
0089cf88	bl 0x00c301d0
0089cf8c	cmp x24,x21
0089cf90	mov x22,x24
0089cf94	b.eq 0x0089cfcc
0089cf98	ldr x0,[x24, #-0x38]!
0089cf9c	cbz x0,0x0089cf84
0089cfa0	bl 0x00c301d0
0089cfa4	ldur x0,[x22, #-0x20]
0089cfa8	stur xzr,[x22, #-0x38]
0089cfac	bl 0x00c301d0
0089cfb0	mov x0,xzr
0089cfb4	stp xzr,xzr,[x22, #-0x30]
0089cfb8	stur xzr,[x22, #-0x20]
0089cfbc	bl 0x00c301d0
0089cfc0	stur xzr,[x22, #-0x18]
0089cfc4	sturb w23,[x22, #-0x8]
0089cfc8	b 0x0089cf84
0089cfcc	ldr x8,[x19]
0089cfd0	ldr x0,[x8]
0089cfd4	ldr x8,[x8, #0x10]
0089cfd8	str x21,[x20, #0x8]
0089cfdc	sub x1,x8,x0
0089cfe0	ldp x20,x19,[sp, #0x30]
0089cfe4	ldp x22,x21,[sp, #0x20]
0089cfe8	ldp x24,x23,[sp, #0x10]
0089cfec	ldp x29,x30,[sp], #0x40
0089cff0	b 0x00c2fe80
0089cff4	ldp x20,x19,[sp, #0x30]
0089cff8	ldp x22,x21,[sp, #0x20]
0089cffc	ldp x24,x23,[sp, #0x10]
0089d000	ldp x29,x30,[sp], #0x40
0089d004	ret
