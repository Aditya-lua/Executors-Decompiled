; FUN_00807e7c @ 00807e7c
00807e7c	stp x29,x30,[sp, #-0x20]!
00807e80	stp x20,x19,[sp, #0x10]
00807e84	mov x29,sp
00807e88	mov x19,x1
00807e8c	mov w1,#0xffffd8ee
00807e90	mov x20,x0
00807e94	mov x2,x19
00807e98	bl 0x008acba4
00807e9c	mov x0,x20
00807ea0	mov w1,#0xffffffff
00807ea4	bl 0x008ab0e0
00807ea8	cmp w0,#0x6
00807eac	b.ne 0x00807ef0
00807eb0	mov x0,x20
00807eb4	bl 0x008ac024
00807eb8	mov x0,x20
00807ebc	mov w1,#0xfffffffe
00807ec0	bl 0x008ae174
00807ec4	cbz w0,0x00807ef0
00807ec8	mov x0,x20
00807ecc	mov w1,#0xfffffffe
00807ed0	bl 0x008aaf04
00807ed4	mov x0,x20
00807ed8	mov w1,#0xfffffffe
00807edc	bl 0x008aac40
00807ee0	mov x0,x20
00807ee4	mov w1,#0xfffffffb
00807ee8	bl 0x008ad70c
00807eec	b 0x00807eb8
00807ef0	mov x0,x20
00807ef4	mov w1,#0xfffffffe
00807ef8	bl 0x008aa994
00807efc	mov x0,x20
00807f00	mov w1,#0xffffd8ee
00807f04	mov x2,x19
00807f08	ldp x20,x19,[sp, #0x10]
00807f0c	ldp x29,x30,[sp], #0x20
00807f10	b 0x008ad800
