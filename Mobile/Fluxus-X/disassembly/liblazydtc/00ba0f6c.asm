; FUN_00ba0f6c @ 00ba0f6c
00ba0f6c	sub sp,sp,#0x70
00ba0f70	stp x26,x25,[sp, #0x20]
00ba0f74	stp x24,x23,[sp, #0x30]
00ba0f78	stp x22,x21,[sp, #0x40]
00ba0f7c	stp x20,x19,[sp, #0x50]
00ba0f80	stp x29,x30,[sp, #0x60]
00ba0f84	add x29,sp,#0x60
00ba0f88	mrs x26,tpidr_el0
00ba0f8c	ldr x8,[x26, #0x28]
00ba0f90	mov x20,x0
00ba0f94	add x0,sp,#0x8
00ba0f98	mov x24,x6
00ba0f9c	mov x25,x5
00ba0fa0	mov x19,x4
00ba0fa4	mov x23,x3
00ba0fa8	mov x22,x2
00ba0fac	mov w21,w1
00ba0fb0	str x8,[sp, #0x18]
00ba0fb4	bl 0x00c41c00
00ba0fb8	add x0,sp,#0x8
00ba0fbc	mov w1,#0x10
00ba0fc0	mov x2,x25
00ba0fc4	mov x3,x24
00ba0fc8	bl 0x00c41ba0
00ba0fcc	mov w24,w0
00ba0fd0	cbnz w0,0x00ba103c
00ba0fd4	add x0,sp,#0x8
00ba0fd8	add x1,sp,#0x8
00ba0fdc	mov x2,x19
00ba0fe0	bl 0x00c41c80
00ba0fe4	mov w24,w0
00ba0fe8	cbnz w0,0x00ba103c
00ba0fec	add x0,sp,#0x8
00ba0ff0	add x1,sp,#0x8
00ba0ff4	mov x2,x23
00ba0ff8	bl 0x00c41b20
00ba0ffc	mov w24,w0
00ba1000	cbnz w0,0x00ba103c
00ba1004	add x2,sp,#0x8
00ba1008	mov x0,x20
00ba100c	mov x1,x22
00ba1010	bl 0x00c41c80
00ba1014	mov w24,w0
00ba1018	cbnz w0,0x00ba103c
00ba101c	ldrh w8,[x20, #0x8]
00ba1020	mov x0,x20
00ba1024	mov x1,x20
00ba1028	mov x2,x19
00ba102c	mul w8,w8,w21
00ba1030	strh w8,[x20, #0x8]
00ba1034	bl 0x00c41c60
00ba1038	mov w24,w0
00ba103c	add x0,sp,#0x8
00ba1040	bl 0x00c41bb0
00ba1044	ldr x8,[x26, #0x28]
00ba1048	ldr x9,[sp, #0x18]
00ba104c	cmp x8,x9
00ba1050	b.ne 0x00ba1074
00ba1054	mov w0,w24
00ba1058	ldp x29,x30,[sp, #0x60]
00ba105c	ldp x20,x19,[sp, #0x50]
00ba1060	ldp x22,x21,[sp, #0x40]
00ba1064	ldp x24,x23,[sp, #0x30]
00ba1068	ldp x26,x25,[sp, #0x20]
00ba106c	add sp,sp,#0x70
00ba1070	ret
00ba1074	bl 0x00c2fec0
