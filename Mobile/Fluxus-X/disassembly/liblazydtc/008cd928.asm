; FUN_008cd928 @ 008cd928
008cd928	stp x29,x30,[sp, #-0x40]!
008cd92c	str x23,[sp, #0x10]
008cd930	stp x22,x21,[sp, #0x20]
008cd934	stp x20,x19,[sp, #0x30]
008cd938	mov x29,sp
008cd93c	ldrh w8,[x0, #0x28]
008cd940	mov w20,w2
008cd944	mov w21,w1
008cd948	mov x19,x0
008cd94c	add w8,w8,#0x1
008cd950	and w9,w8,#0xffff
008cd954	strh w8,[x0, #0x28]
008cd958	cmp w9,#0xc8
008cd95c	b.cc 0x008cd968
008cd960	mov x0,x19
008cd964	bl 0x008b42d8
008cd968	ldr x8,[x19, #0x48]
008cd96c	ldr x22,[x19, #0x68]
008cd970	sub x8,x8,x22
008cd974	cmp x8,#0x140
008cd978	b.gt 0x008cd98c
008cd97c	mov x0,x19
008cd980	mov w1,#0x14
008cd984	bl 0x008b41e4
008cd988	ldr x22,[x19, #0x68]
008cd98c	ldr x8,[x19, #0x50]
008cd990	ldr x9,[x19, #0x18]
008cd994	sub x21,x22,w21, SXTW  #0x4
008cd998	cmp x8,x9
008cd99c	sub x23,x21,#0x10
008cd9a0	b.eq 0x008cd9b0
008cd9a4	add x0,x8,#0x30
008cd9a8	str x0,[x19, #0x50]
008cd9ac	b 0x008cd9b8
008cd9b0	mov x0,x19
008cd9b4	bl 0x008b4200
008cd9b8	add x8,x22,#0x140
008cd9bc	stp xzr,x23,[x0]
008cd9c0	stp x21,x8,[x0, #0x10]
008cd9c4	mvn w8,w20
008cd9c8	lsr w8,w8,#0x1f
008cd9cc	str xzr,[x0, #0x20]
008cd9d0	str x21,[x19, #0x70]
008cd9d4	stp w8,wzr,[x0, #0x28]
008cd9d8	mov x0,x19
008cd9dc	ldur x8,[x21, #-0x10]
008cd9e0	ldr x8,[x8, #0x28]
008cd9e4	blr x8
008cd9e8	ldr x8,[x19, #0x50]
008cd9ec	tbnz w20,#0x1f,0x008cda1c
008cd9f0	cmp w0,#0x1
008cd9f4	b.lt 0x008cda10
008cd9f8	ldr x9,[x19, #0x68]
008cd9fc	ldur x10,[x8, #-0x20]
008cda00	sub x9,x9,w0, UXTW  #0x4
008cda04	ldr q0,[x9]
008cda08	str q0,[x10,w20, uxtw #4]
008cda0c	b 0x008cda1c
008cda10	ldur x9,[x8, #-0x20]
008cda14	add x9,x9,w20, UXTW  #0x4
008cda18	str wzr,[x9, #0xc]
008cda1c	ldur q0,[x8, #-0x20]
008cda20	ldrh w9,[x19, #0x28]
008cda24	sub x8,x8,#0x30
008cda28	str x8,[x19, #0x50]
008cda2c	ext v0.16B,v0.16B,v0.16B,0x8
008cda30	sub w8,w9,#0x1
008cda34	stur q0,[x19, #0x68]
008cda38	strh w8,[x19, #0x28]
008cda3c	ldp x20,x19,[sp, #0x30]
008cda40	ldr x23,[sp, #0x10]
008cda44	ldp x22,x21,[sp, #0x20]
008cda48	ldp x29,x30,[sp], #0x40
008cda4c	ret
