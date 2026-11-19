; FUN_0080ccc8 @ 0080ccc8
0080ccc8	stp x29,x30,[sp, #-0x20]!
0080cccc	stp x20,x19,[sp, #0x10]
0080ccd0	mov x29,sp
0080ccd4	ldr x19,[x0]
0080ccd8	str xzr,[x0]
0080ccdc	cbz x19,0x0080cd30
0080cce0	ldrb w8,[x0, #0x10]
0080cce4	cmp w8,#0x1
0080cce8	b.ne 0x0080cd1c
0080ccec	ldr x20,[x19, #0x20]
0080ccf0	cbz x20,0x0080cd1c
0080ccf4	add x1,x20,#0x8
0080ccf8	mov x0,#-0x1
0080ccfc	bl 0x00c2bd10
0080cd00	cbnz x0,0x0080cd1c
0080cd04	ldr x8,[x20]
0080cd08	mov x0,x20
0080cd0c	ldr x8,[x8, #0x10]
0080cd10	blr x8
0080cd14	mov x0,x20
0080cd18	bl 0x00c2ff00
0080cd1c	mov x0,x19
0080cd20	mov w1,#0x28
0080cd24	ldp x20,x19,[sp, #0x10]
0080cd28	ldp x29,x30,[sp], #0x20
0080cd2c	b 0x00c2fe80
0080cd30	ldp x20,x19,[sp, #0x10]
0080cd34	ldp x29,x30,[sp], #0x20
0080cd38	ret
