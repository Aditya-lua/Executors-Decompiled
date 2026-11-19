; CONF_get_section @ 00a0d010
00a0d010	cbz x0,0x00a0d0a8
00a0d014	sub sp,sp,#0x60
00a0d018	str x21,[sp, #0x30]
00a0d01c	adrp x21,0xd21000
00a0d020	stp x20,x19,[sp, #0x40]
00a0d024	mov x20,x0
00a0d028	ldr x0,[x21, #0x950]
00a0d02c	mov x19,x1
00a0d030	stp x29,x30,[sp, #0x50]
00a0d034	add x29,sp,#0x50
00a0d038	cbnz x0,0x00a0d044
00a0d03c	bl 0x00c39420
00a0d040	str x0,[x21, #0x950]
00a0d044	ldr x8,[x0, #0x10]
00a0d048	mov x0,sp
00a0d04c	blr x8
00a0d050	str x20,[sp, #0x10]
00a0d054	cbz x19,0x00a0d068
00a0d058	mov x0,sp
00a0d05c	mov x1,x19
00a0d060	bl 0x00c393e0
00a0d064	b 0x00a0d098
00a0d068	bl 0x00c342a0
00a0d06c	adrp x0,0x2af000
00a0d070	adrp x2,0x2d3000
00a0d074	add x0,x0,#0xd73
00a0d078	add x2,x2,#0x931
00a0d07c	mov w1,#0x125
00a0d080	bl 0x00c342b0
00a0d084	orr w0,wzr,#0xe
00a0d088	mov w1,#0x6b
00a0d08c	mov x2,xzr
00a0d090	bl 0x00c342c0
00a0d094	mov x0,xzr
00a0d098	ldp x29,x30,[sp, #0x50]
00a0d09c	ldp x20,x19,[sp, #0x40]
00a0d0a0	ldr x21,[sp, #0x30]
00a0d0a4	add sp,sp,#0x60
00a0d0a8	ret
