; FUN_0096f9e8 @ 0096f9e8
0096f9e8	stp x20,x19,[sp, #-0x20]!
0096f9ec	stp x29,x30,[sp, #0x10]
0096f9f0	add x29,sp,#0x10
0096f9f4	mov x20,x0
0096f9f8	orr w0,wzr,#0x6
0096f9fc	mov x19,x1
0096fa00	bl 0x00c32620
0096fa04	adrp x2,0x2a5000
0096fa08	adrp x3,0x2db000
0096fa0c	mov x4,x0
0096fa10	add x2,x2,#0x600
0096fa14	add x3,x3,#0x707
0096fa18	mov x0,x20
0096fa1c	mov x1,x19
0096fa20	bl 0x00c31b70
0096fa24	ldp x29,x30,[sp, #0x10]
0096fa28	sxtw x0,w0
0096fa2c	ldp x20,x19,[sp], #0x20
0096fa30	ret
