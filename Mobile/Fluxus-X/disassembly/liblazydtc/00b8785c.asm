; FUN_00b8785c @ 00b8785c
00b8785c	sub sp,sp,#0x50
00b87860	str x23,[sp, #0x10]
00b87864	stp x22,x21,[sp, #0x20]
00b87868	stp x20,x19,[sp, #0x30]
00b8786c	stp x29,x30,[sp, #0x40]
00b87870	add x29,sp,#0x40
00b87874	mrs x22,tpidr_el0
00b87878	ldr x8,[x22, #0x28]
00b8787c	mov x19,x0
00b87880	mov x20,x1
00b87884	mov x1,x2
00b87888	str x8,[sp, #0x8]
00b8788c	str xzr,[x2]
00b87890	ldr w21,[x0, #0x4]
00b87894	ldr w23,[x0, #0x14]
00b87898	mov w0,w21
00b8789c	bl 0x00c431f0
00b878a0	cbnz w0,0x00b878e4
00b878a4	mov w0,w21
00b878a8	bl 0x00c43200
00b878ac	cbnz w0,0x00b878e4
00b878b0	tst w21,#0xff
00b878b4	b.eq 0x00b878cc
00b878b8	ldr w0,[x19, #0x14]
00b878bc	mov w1,wzr
00b878c0	bl 0x00c431b0
00b878c4	cbnz w0,0x00b878d0
00b878c8	b 0x00b878e0
00b878cc	cbnz w23,0x00b878e0
00b878d0	ldr w8,[x19, #0x8]
00b878d4	mov w9,#0xffff00fc
00b878d8	tst w8,w9
00b878dc	b.eq 0x00b8790c
00b878e0	mov w0,#0xffffff79
00b878e4	ldr x8,[x22, #0x28]
00b878e8	ldr x9,[sp, #0x8]
00b878ec	cmp x8,x9
00b878f0	b.ne 0x00b87968
00b878f4	ldp x29,x30,[sp, #0x40]
00b878f8	ldp x20,x19,[sp, #0x30]
00b878fc	ldp x22,x21,[sp, #0x20]
00b87900	ldr x23,[sp, #0x10]
00b87904	add sp,sp,#0x50
00b87908	ret
00b8790c	ldrh w8,[x19, #0x2]
00b87910	orr w9,wzr,#0xfff8
00b87914	cmp w8,w9
00b87918	b.ls 0x00b87924
00b8791c	mov w0,#0xffffff7a
00b87920	b 0x00b878e4
00b87924	ldrb w21,[x19, #0x4]
00b87928	add x8,sp,#0x4
00b8792c	mov x1,x20
00b87930	cmp w21,#0x0
00b87934	csel x0,x8,xzr,eq
00b87938	bl 0x00c431c0
00b8793c	cbnz w0,0x00b878e4
00b87940	ldr x8,[x20]
00b87944	ldr x9,[x19, #0x10]
00b87948	str x9,[x8, #0x10]
00b8794c	ldr q0,[x19]
00b87950	str q0,[x8]
00b87954	cbnz w21,0x00b878e4
00b87958	ldr w9,[sp, #0x4]
00b8795c	mov w0,wzr
00b87960	str w9,[x8, #0x14]
00b87964	b 0x00b878e4
00b87968	bl 0x00c2fec0
