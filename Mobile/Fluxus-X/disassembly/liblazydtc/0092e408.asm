; FUN_0092e408 @ 0092e408
0092e408	sub sp,sp,#0x60
0092e40c	stp x22,x21,[sp, #0x30]
0092e410	stp x20,x19,[sp, #0x40]
0092e414	stp x29,x30,[sp, #0x50]
0092e418	add x29,sp,#0x50
0092e41c	mrs x22,tpidr_el0
0092e420	ldr x8,[x22, #0x28]
0092e424	add x1,sp,#0x8
0092e428	mov x20,x0
0092e42c	str x8,[sp, #0x28]
0092e430	ldr x21,[x0, #0xc0]
0092e434	bl 0x0092bcf8
0092e438	add x19,x20,#0x90
0092e43c	add x2,sp,#0x8
0092e440	mov x0,x21
0092e444	mov x1,x20
0092e448	mov x3,x19
0092e44c	bl 0x0092dfc0
0092e450	cbnz w0,0x0092e464
0092e454	ldur q0,[sp, #0x18]
0092e458	str q0,[x19, #0x10]
0092e45c	ldur q0,[sp, #0x8]
0092e460	str q0,[x19]
0092e464	ldr x8,[x22, #0x28]
0092e468	ldr x9,[sp, #0x28]
0092e46c	cmp w0,#0x0
0092e470	mov w10,#0x2a
0092e474	csel w0,wzr,w10,eq
0092e478	cmp x8,x9
0092e47c	b.ne 0x0092e494
0092e480	ldp x29,x30,[sp, #0x50]
0092e484	ldp x20,x19,[sp, #0x40]
0092e488	ldp x22,x21,[sp, #0x30]
0092e48c	add sp,sp,#0x60
0092e490	ret
0092e494	bl 0x00c2fec0
