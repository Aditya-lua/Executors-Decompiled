; NCONF_new_ex @ 00a0d748
00a0d748	str x19,[sp, #-0x20]!
00a0d74c	mov x19,x0
00a0d750	stp x29,x30,[sp, #0x10]
00a0d754	add x29,sp,#0x10
00a0d758	cbnz x1,0x00a0d764
00a0d75c	bl 0x00c39420
00a0d760	mov x1,x0
00a0d764	ldr x8,[x1, #0x8]
00a0d768	mov x0,x1
00a0d76c	blr x8
00a0d770	cbz x0,0x00a0d77c
00a0d774	str x19,[x0, #0x28]
00a0d778	b 0x00a0d7b0
00a0d77c	bl 0x00c342a0
00a0d780	adrp x0,0x2af000
00a0d784	adrp x2,0x2a5000
00a0d788	add x0,x0,#0xd73
00a0d78c	add x2,x2,#0xcb3
00a0d790	mov w1,#0xbf
00a0d794	bl 0x00c342b0
00a0d798	mov w1,#0x100
00a0d79c	orr w0,wzr,#0xe
00a0d7a0	movk w1,#0xc, LSL #16
00a0d7a4	mov x2,xzr
00a0d7a8	bl 0x00c342c0
00a0d7ac	mov x0,xzr
00a0d7b0	ldp x29,x30,[sp, #0x10]
00a0d7b4	ldr x19,[sp], #0x20
00a0d7b8	ret
