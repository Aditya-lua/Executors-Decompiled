; FUN_00b4d004 @ 00b4d004
00b4d004	sub sp,sp,#0xd0
00b4d008	stp x29,x30,[sp, #0xc0]
00b4d00c	add x29,sp,#0xc0
00b4d010	stp w1,w0,[x29, #-0x8]
00b4d014	mov x0,x2
00b4d018	str x19,[sp, #0xb0]
00b4d01c	bl 0x00c38c30
00b4d020	mov x19,x0
00b4d024	add x0,sp,#0x30
00b4d028	orr w2,wzr,#0x78
00b4d02c	mov w1,wzr
00b4d030	bl 0x00c301c0
00b4d034	adrp x0,0x2a0000
00b4d038	add x0,x0,#0x361
00b4d03c	add x8,sp,#0x8
00b4d040	sub x1,x29,#0x4
00b4d044	bl 0x00c36260
00b4d048	ldr x8,[sp, #0x28]
00b4d04c	ldur q0,[sp, #0x18]
00b4d050	ldur q1,[sp, #0x8]
00b4d054	adrp x0,0x2cd000
00b4d058	str x8,[sp, #0x50]
00b4d05c	add x0,x0,#0xb87
00b4d060	add x8,sp,#0x8
00b4d064	sub x1,x29,#0x8
00b4d068	stp q1,q0,[sp, #0x30]
00b4d06c	bl 0x00c36260
00b4d070	ldr x8,[sp, #0x28]
00b4d074	ldur q0,[sp, #0x18]
00b4d078	ldur q1,[sp, #0x8]
00b4d07c	add x0,sp,#0x30
00b4d080	str x8,[sp, #0x78]
00b4d084	stur q0,[sp, #0x68]
00b4d088	stur q1,[sp, #0x58]
00b4d08c	ldp x8,x1,[x19, #0x60]
00b4d090	blr x8
00b4d094	ldp x29,x30,[sp, #0xc0]
00b4d098	ldr x19,[sp, #0xb0]
00b4d09c	add sp,sp,#0xd0
00b4d0a0	ret
