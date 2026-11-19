; BUF_MEM_grow_clean @ 00a0bb78
00a0bb78	stp x22,x21,[sp, #-0x30]!
00a0bb7c	stp x20,x19,[sp, #0x10]
00a0bb80	stp x29,x30,[sp, #0x20]
00a0bb84	ldr x8,[x0]
00a0bb88	mov x20,x0
00a0bb8c	mov x19,x1
00a0bb90	add x29,sp,#0x20
00a0bb94	subs x2,x8,x1
00a0bb98	b.cs 0x00a0bbd4
00a0bb9c	ldr x1,[x20, #0x10]
00a0bba0	cmp x1,x19
00a0bba4	b.cs 0x00a0bbe4
00a0bba8	mov w8,#0xfffd
00a0bbac	movk w8,#0x5fff, LSL #16
00a0bbb0	cmp x19,x8
00a0bbb4	b.cc 0x00a0bbf0
00a0bbb8	bl 0x00c342a0
00a0bbbc	adrp x0,0x29f000
00a0bbc0	adrp x2,0x2d1000
00a0bbc4	add x0,x0,#0xf43
00a0bbc8	add x2,x2,#0x73f
00a0bbcc	mov w1,#0x80
00a0bbd0	b 0x00a0bcc8
00a0bbd4	ldr x8,[x20, #0x8]
00a0bbd8	cbz x8,0x00a0bc98
00a0bbdc	add x0,x8,x19
00a0bbe0	b 0x00a0bc90
00a0bbe4	ldr x9,[x20, #0x8]
00a0bbe8	add x0,x9,x8
00a0bbec	b 0x00a0bc8c
00a0bbf0	mov w10,#0xaaab
00a0bbf4	add w8,w19,#0x3
00a0bbf8	ldrb w9,[x20, #0x18]
00a0bbfc	movk w10,#0xaaaa, LSL #16
00a0bc00	umull x8,w8,w10
00a0bc04	lsr x8,x8,#0x1f
00a0bc08	and x21,x8,#0x1fffffffc
00a0bc0c	tbnz w9,#0x0,0x00a0bc30
00a0bc10	ldr x0,[x20, #0x8]
00a0bc14	adrp x3,0x29f000
00a0bc18	add x3,x3,#0xf43
00a0bc1c	mov w4,#0x87
00a0bc20	mov x2,x21
00a0bc24	bl 0x00c38050
00a0bc28	mov x22,x0
00a0bc2c	b 0x00a0bc7c
00a0bc30	adrp x1,0x29f000
00a0bc34	add x1,x1,#0xf43
00a0bc38	orr w2,wzr,#0x3e
00a0bc3c	mov x0,x21
00a0bc40	bl 0x00c39220
00a0bc44	mov x22,x0
00a0bc48	cbz x0,0x00a0bc7c
00a0bc4c	ldr x1,[x20, #0x8]
00a0bc50	cbz x1,0x00a0bc7c
00a0bc54	ldr x2,[x20]
00a0bc58	mov x0,x22
00a0bc5c	bl 0x00c2ffd0
00a0bc60	ldp x1,x0,[x20]
00a0bc64	adrp x2,0x29f000
00a0bc68	add x2,x2,#0xf43
00a0bc6c	mov w3,#0x42
00a0bc70	bl 0x00c38e10
00a0bc74	str xzr,[x20, #0x8]
00a0bc78	b 0x00a0bc80
00a0bc7c	cbz x22,0x00a0bcb0
00a0bc80	ldr x8,[x20]
00a0bc84	stp x22,x21,[x20, #0x8]
00a0bc88	add x0,x22,x8
00a0bc8c	sub x2,x19,x8
00a0bc90	mov w1,wzr
00a0bc94	bl 0x00c301c0
00a0bc98	str x19,[x20]
00a0bc9c	mov x0,x19
00a0bca0	ldp x29,x30,[sp, #0x20]
00a0bca4	ldp x20,x19,[sp, #0x10]
00a0bca8	ldp x22,x21,[sp], #0x30
00a0bcac	ret
00a0bcb0	bl 0x00c342a0
00a0bcb4	adrp x0,0x29f000
00a0bcb8	adrp x2,0x2d1000
00a0bcbc	add x0,x0,#0xf43
00a0bcc0	add x2,x2,#0x73f
00a0bcc4	mov w1,#0x89
00a0bcc8	bl 0x00c342b0
00a0bccc	mov w1,#0x100
00a0bcd0	orr w0,wzr,#0x7
00a0bcd4	movk w1,#0xc, LSL #16
00a0bcd8	mov x2,xzr
00a0bcdc	bl 0x00c342c0
00a0bce0	mov x19,xzr
00a0bce4	b 0x00a0bc9c
