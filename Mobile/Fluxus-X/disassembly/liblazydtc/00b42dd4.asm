; FUN_00b42dd4 @ 00b42dd4
00b42dd4	stp x20,x19,[sp, #-0x20]!
00b42dd8	stp x29,x30,[sp, #0x10]
00b42ddc	mov x19,x0
00b42de0	ldr x0,[x0, #0x40]
00b42de4	adrp x20,0x2ce000
00b42de8	add x20,x20,#0x8d0
00b42dec	mov w2,#0xf6
00b42df0	mov x1,x20
00b42df4	add x29,sp,#0x10
00b42df8	bl 0x00c32310
00b42dfc	ldr x0,[x19, #0x8]
00b42e00	bl 0x00c39ab0
00b42e04	ldr x0,[x19, #0x10]
00b42e08	bl 0x00c39ab0
00b42e0c	ldr x0,[x19, #0x20]
00b42e10	bl 0x00c35800
00b42e14	ldp x0,x1,[x19, #0x28]
00b42e18	mov w3,#0xfa
00b42e1c	mov x2,x20
00b42e20	bl 0x00c345e0
00b42e24	ldp x29,x30,[sp, #0x10]
00b42e28	orr w2,wzr,#0xfc
00b42e2c	mov x0,x19
00b42e30	mov x1,x20
00b42e34	ldp x20,x19,[sp], #0x20
00b42e38	b 0x00c32310
