; FUN_0081ee8c @ 0081ee8c
0081ee8c	stp x29,x30,[sp, #-0x20]!
0081ee90	stp x20,x19,[sp, #0x10]
0081ee94	mov x29,sp
0081ee98	adrp x20,0xcb4000
0081ee9c	mov x19,x0
0081eea0	ldr x20,[x20, #0x9f8]
0081eea4	ldr x8,[x20]
0081eea8	ldr x9,[x20, #0x18]
0081eeac	str x8,[x0]
0081eeb0	ldur x8,[x8, #-0x18]
0081eeb4	str x9,[x0, x8#0x0]
0081eeb8	adrp x8,0xcb4000
0081eebc	ldr x8,[x8, #0xa00]
0081eec0	ldrb w9,[x0, #0x48]
0081eec4	add x8,x8,#0x10
0081eec8	str x8,[x0, #0x8]
0081eecc	tbz w9,#0x0,0x0081eee0
0081eed0	ldr x8,[x19, #0x48]
0081eed4	ldr x0,[x19, #0x58]
0081eed8	and x1,x8,#-0x2
0081eedc	bl 0x00c2fe80
0081eee0	adrp x8,0xcb4000
0081eee4	add x0,x19,#0x10
0081eee8	ldr x8,[x8, #0xa08]
0081eeec	add x8,x8,#0x10
0081eef0	str x8,[x19, #0x8]
0081eef4	bl 0x00c30090
0081eef8	add x1,x20,#0x8
0081eefc	mov x0,x19
0081ef00	bl 0x00c303d0
0081ef04	add x0,x19,#0x70
0081ef08	ldp x20,x19,[sp, #0x10]
0081ef0c	ldp x29,x30,[sp], #0x20
0081ef10	b 0x00c300f0
