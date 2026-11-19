; curl_multi_fdset @ 0092bbb8
0092bbb8	sub sp,sp,#0x90
0092bbbc	str x27,[sp, #0x30]
0092bbc0	stp x26,x25,[sp, #0x40]
0092bbc4	stp x24,x23,[sp, #0x50]
0092bbc8	stp x22,x21,[sp, #0x60]
0092bbcc	stp x20,x19,[sp, #0x70]
0092bbd0	stp x29,x30,[sp, #0x80]
0092bbd4	add x29,sp,#0x80
0092bbd8	mrs x23,tpidr_el0
0092bbdc	ldr x8,[x23, #0x28]
0092bbe0	mov x19,x4
0092bbe4	mov x20,x2
0092bbe8	mov x21,x1
0092bbec	str x8,[sp, #0x28]
0092bbf0	cbz x0,0x0092bca8
0092bbf4	ldr w8,[x0]
0092bbf8	mov w9,#0xab1e
0092bbfc	movk w9,#0xb, LSL #16
0092bc00	cmp w8,w9
0092bc04	b.ne 0x0092bca8
0092bc08	ldrb w8,[x0, #0x231]
0092bc0c	tbnz w8,#0x2,0x0092bcdc
0092bc10	movi v0.2D,#0x0
0092bc14	stur q0,[sp, #0x18]
0092bc18	stur q0,[sp, #0x8]
0092bc1c	ldr x22,[x0, #0x8]
0092bc20	cbz x22,0x0092bce4
0092bc24	mov w24,#0xffffffff
0092bc28	add x25,sp,#0x8
0092bc2c	add x1,sp,#0x8
0092bc30	mov x0,x22
0092bc34	bl 0x0092bcf8
0092bc38	ldr w8,[sp, #0x1c]
0092bc3c	cbz w8,0x0092bc9c
0092bc40	mov x26,xzr
0092bc44	ldr w0,[x25, x26, LSL #0x2]
0092bc48	cmp w0,#0x3ff
0092bc4c	b.gt 0x0092bc90
0092bc50	add x27,x25,x26
0092bc54	ldrb w8,[x27, #0x18]
0092bc58	tbz w8,#0x0,0x0092bc6c
0092bc5c	mov x2,#-0x1
0092bc60	mov x1,x21
0092bc64	bl 0x00c31ee0
0092bc68	ldrb w8,[x27, #0x18]
0092bc6c	tbz w8,#0x1,0x0092bc80
0092bc70	ldr w0,[x25, x26, LSL #0x2]
0092bc74	mov x2,#-0x1
0092bc78	mov x1,x20
0092bc7c	bl 0x00c31ee0
0092bc80	ldr w9,[x25, x26, LSL #0x2]
0092bc84	ldr w8,[sp, #0x1c]
0092bc88	cmp w9,w24
0092bc8c	csel w24,w9,w24,gt
0092bc90	add x26,x26,#0x1
0092bc94	cmp x26,w8, UXTW 
0092bc98	b.cc 0x0092bc44
0092bc9c	ldr x22,[x22, #0x10]
0092bca0	cbnz x22,0x0092bc2c
0092bca4	b 0x0092bce8
0092bca8	mov w0,#0x1
0092bcac	ldr x8,[x23, #0x28]
0092bcb0	ldr x9,[sp, #0x28]
0092bcb4	cmp x8,x9
0092bcb8	b.ne 0x0092bcf4
0092bcbc	ldp x29,x30,[sp, #0x80]
0092bcc0	ldp x20,x19,[sp, #0x70]
0092bcc4	ldp x22,x21,[sp, #0x60]
0092bcc8	ldp x24,x23,[sp, #0x50]
0092bccc	ldp x26,x25,[sp, #0x40]
0092bcd0	ldr x27,[sp, #0x30]
0092bcd4	add sp,sp,#0x90
0092bcd8	ret
0092bcdc	mov w0,#0x8
0092bce0	b 0x0092bcac
0092bce4	mov w24,#0xffffffff
0092bce8	mov w0,wzr
0092bcec	str w24,[x19]
0092bcf0	b 0x0092bcac
0092bcf4	bl 0x00c2fec0
