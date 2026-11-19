; FUN_00bd38f4 @ 00bd38f4
00bd38f4	paciasp
00bd38f8	sub sp,sp,#0x30
00bd38fc	stp x29,x30,[sp, #0x10]
00bd3900	stp x20,x19,[sp, #0x20]
00bd3904	add x29,sp,#0x10
00bd3908	mov x19,x0
00bd390c	mov x20,x1
00bd3910	add x0,sp,#0x8
00bd3914	mov x1,x19
00bd3918	mov w2,wzr
00bd391c	stur wzr,[x29, #-0x4]
00bd3920	bl 0x00c44060
00bd3924	ldrb w8,[sp, #0x8]
00bd3928	cmp w8,#0x1
00bd392c	b.ne 0x00bd39a0
00bd3930	ldr x8,[x19]
00bd3934	ldur x9,[x8, #-0x18]
00bd3938	mov x8,sp
00bd393c	add x0,x19,x9
00bd3940	bl 0x00c30070
00bd3944	adrp x1,0xcb5000
00bd3948	mov x0,sp
00bd394c	ldr x1,[x1, #0xba0]
00bd3950	bl 0x00c30080
00bd3954	ldr x8,[x19]
00bd3958	ldr x9,[x0]
00bd395c	ldur x8,[x8, #-0x18]
00bd3960	add x3,x19,x8
00bd3964	ldr x8,[x9, #0x38]
00bd3968	ldr x1,[x3, #0x28]
00bd396c	sub x4,x29,#0x4
00bd3970	mov x2,xzr
00bd3974	mov x5,x20
00bd3978	blr x8
00bd397c	mov x0,sp
00bd3980	bl 0x00c30090
00bd3984	ldr x8,[x19]
00bd3988	ldur x8,[x8, #-0x18]
00bd398c	add x0,x19,x8
00bd3990	ldur w8,[x29, #-0x4]
00bd3994	ldr w9,[x0, #0x20]
00bd3998	orr w1,w9,w8
00bd399c	bl 0x00c30130
00bd39a0	mov x0,x19
00bd39a4	ldp x20,x19,[sp, #0x20]
00bd39a8	ldp x29,x30,[sp, #0x10]
00bd39ac	add sp,sp,#0x30
00bd39b0	autiasp
00bd39b4	ret
