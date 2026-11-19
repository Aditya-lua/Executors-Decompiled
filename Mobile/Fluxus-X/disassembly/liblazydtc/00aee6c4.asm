; UI_dup_user_data @ 00aee6c4
00aee6c4	stp x20,x19,[sp, #-0x20]!
00aee6c8	stp x29,x30,[sp, #0x10]
00aee6cc	ldr x9,[x0]
00aee6d0	add x29,sp,#0x10
00aee6d4	ldr x8,[x9, #0x30]
00aee6d8	cbz x8,0x00aee728
00aee6dc	ldr x9,[x9, #0x38]
00aee6e0	cbz x9,0x00aee728
00aee6e4	mov x19,x0
00aee6e8	blr x8
00aee6ec	cbz x0,0x00aee750
00aee6f0	ldr w8,[x19, #0x28]
00aee6f4	mov x20,x0
00aee6f8	tbz w8,#0x1,0x00aee714
00aee6fc	ldr x8,[x19]
00aee700	ldr x1,[x19, #0x10]
00aee704	mov x0,x19
00aee708	ldr x8,[x8, #0x38]
00aee70c	blr x8
00aee710	ldr w8,[x19, #0x28]
00aee714	mov w0,wzr
00aee718	orr w8,w8,#0x2
00aee71c	str x20,[x19, #0x10]
00aee720	str w8,[x19, #0x28]
00aee724	b 0x00aee784
00aee728	bl 0x00c342a0
00aee72c	adrp x0,0x2a0000
00aee730	adrp x2,0x2b4000
00aee734	add x0,x0,#0xc2f
00aee738	add x2,x2,#0x964
00aee73c	mov w1,#0x19a
00aee740	bl 0x00c342b0
00aee744	mov w0,#0x28
00aee748	orr w1,wzr,#0x70
00aee74c	b 0x00aee778
00aee750	bl 0x00c342a0
00aee754	adrp x0,0x2a0000
00aee758	adrp x2,0x2b4000
00aee75c	add x0,x0,#0xc2f
00aee760	add x2,x2,#0x964
00aee764	mov w1,#0x1a0
00aee768	bl 0x00c342b0
00aee76c	mov w1,#0x100
00aee770	mov w0,#0x28
00aee774	movk w1,#0xc, LSL #16
00aee778	mov x2,xzr
00aee77c	bl 0x00c342c0
00aee780	mov w0,#0xffffffff
00aee784	ldp x29,x30,[sp, #0x10]
00aee788	ldp x20,x19,[sp], #0x20
00aee78c	ret
