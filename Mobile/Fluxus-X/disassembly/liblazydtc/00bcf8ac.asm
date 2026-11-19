; FUN_00bcf8ac @ 00bcf8ac
00bcf8ac	paciasp
00bcf8b0	sub sp,sp,#0x30
00bcf8b4	stp x29,x30,[sp, #0x10]
00bcf8b8	stp x20,x19,[sp, #0x20]
00bcf8bc	add x29,sp,#0x10
00bcf8c0	mov x19,x0
00bcf8c4	mov x20,x1
00bcf8c8	add x0,sp,#0x8
00bcf8cc	mov x1,x19
00bcf8d0	mov w2,wzr
00bcf8d4	stur wzr,[x29, #-0x4]
00bcf8d8	bl 0x00c30140
00bcf8dc	ldrb w8,[sp, #0x8]
00bcf8e0	cmp w8,#0x1
00bcf8e4	b.ne 0x00bcf958
00bcf8e8	ldr x8,[x19]
00bcf8ec	ldur x9,[x8, #-0x18]
00bcf8f0	mov x8,sp
00bcf8f4	add x0,x19,x9
00bcf8f8	bl 0x00c30070
00bcf8fc	adrp x1,0xcb4000
00bcf900	mov x0,sp
00bcf904	ldr x1,[x1, #0xf38]
00bcf908	bl 0x00c30080
00bcf90c	ldr x8,[x19]
00bcf910	ldr x9,[x0]
00bcf914	ldur x8,[x8, #-0x18]
00bcf918	add x3,x19,x8
00bcf91c	ldr x8,[x9, #0x50]
00bcf920	ldr x1,[x3, #0x28]
00bcf924	sub x4,x29,#0x4
00bcf928	mov x2,xzr
00bcf92c	mov x5,x20
00bcf930	blr x8
00bcf934	mov x0,sp
00bcf938	bl 0x00c30090
00bcf93c	ldr x8,[x19]
00bcf940	ldur x8,[x8, #-0x18]
00bcf944	add x0,x19,x8
00bcf948	ldur w8,[x29, #-0x4]
00bcf94c	ldr w9,[x0, #0x20]
00bcf950	orr w1,w9,w8
00bcf954	bl 0x00c30130
00bcf958	mov x0,x19
00bcf95c	ldp x20,x19,[sp, #0x20]
00bcf960	ldp x29,x30,[sp, #0x10]
00bcf964	add sp,sp,#0x30
00bcf968	autiasp
00bcf96c	ret
