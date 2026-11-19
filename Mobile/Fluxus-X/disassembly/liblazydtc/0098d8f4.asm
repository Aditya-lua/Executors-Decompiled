; ix::WebSocket::start @ 0098d8f4
0098d8f4	sub sp,sp,#0x50
0098d8f8	stp x20,x19,[sp, #0x30]
0098d8fc	stp x29,x30,[sp, #0x40]
0098d900	add x29,sp,#0x40
0098d904	mrs x20,tpidr_el0
0098d908	ldr x8,[x20, #0x28]
0098d90c	mov x19,x0
0098d910	stur x8,[x29, #-0x18]
0098d914	ldr x8,[x0, #0x408]
0098d918	cbnz x8,0x0098d960
0098d91c	adrp x8,0xcb5000
0098d920	ldr x8,[x8, #0x48]
0098d924	movi v0.2D,#0x0
0098d928	add x0,sp,#0x20
0098d92c	add x1,sp,#0x10
0098d930	mov v0.D[0x0],x8
0098d934	add x2,sp,#0x8
0098d938	str q0,[sp, #0x10]
0098d93c	str x19,[sp, #0x8]
0098d940	bl 0x0098db04
0098d944	ldr x8,[x19, #0x408]
0098d948	cbnz x8,0x0098d984
0098d94c	ldr x8,[sp, #0x20]
0098d950	add x0,sp,#0x20
0098d954	str x8,[x19, #0x408]
0098d958	str xzr,[sp, #0x20]
0098d95c	bl 0x00c2ff80
0098d960	ldr x8,[x20, #0x28]
0098d964	ldur x9,[x29, #-0x18]
0098d968	cmp x8,x9
0098d96c	b.ne 0x0098d980
0098d970	ldp x29,x30,[sp, #0x40]
0098d974	ldp x20,x19,[sp, #0x30]
0098d978	add sp,sp,#0x50
0098d97c	ret
0098d980	bl 0x00c2fec0
0098d984	bl 0x00c2fff0
