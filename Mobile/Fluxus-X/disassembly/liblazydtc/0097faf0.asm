; FUN_0097faf0 @ 0097faf0
0097faf0	str x19,[sp, #-0x20]!
0097faf4	stp x29,x30,[sp, #0x10]
0097faf8	add x29,sp,#0x10
0097fafc	ldrb w8,[x0, #0x10]
0097fb00	mov x19,x0
0097fb04	tbz w8,#0x0,0x0097fb10
0097fb08	ldr x0,[x19, #0x20]
0097fb0c	bl 0x00c301d0
0097fb10	ldp x29,x30,[sp, #0x10]
0097fb14	mov x0,x19
0097fb18	ldr x19,[sp], #0x20
0097fb1c	b 0x00c301d0
