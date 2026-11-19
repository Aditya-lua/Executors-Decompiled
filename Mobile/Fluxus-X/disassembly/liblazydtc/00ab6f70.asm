; PEM_read @ 00ab6f70
00ab6f70	stp x24,x23,[sp, #-0x40]!
00ab6f74	stp x22,x21,[sp, #0x10]
00ab6f78	stp x20,x19,[sp, #0x20]
00ab6f7c	stp x29,x30,[sp, #0x30]
00ab6f80	add x29,sp,#0x30
00ab6f84	mov x19,x4
00ab6f88	mov x20,x3
00ab6f8c	mov x21,x2
00ab6f90	mov x22,x1
00ab6f94	mov x24,x0
00ab6f98	bl 0x00c32270
00ab6f9c	bl 0x00c32240
00ab6fa0	cbz x0,0x00ab6fe8
00ab6fa4	mov w1,#0x6a
00ab6fa8	mov x2,xzr
00ab6fac	mov x3,x24
00ab6fb0	mov x23,x0
00ab6fb4	bl 0x00c321a0
00ab6fb8	mov w5,#0x2
00ab6fbc	mov x0,x23
00ab6fc0	mov x1,x22
00ab6fc4	mov x2,x21
00ab6fc8	mov x3,x20
00ab6fcc	mov x4,x19
00ab6fd0	bl 0x00ab7038
00ab6fd4	mov w19,w0
00ab6fd8	mov x0,x23
00ab6fdc	bl 0x00c31a40
00ab6fe0	mov w0,w19
00ab6fe4	b 0x00ab701c
00ab6fe8	bl 0x00c342a0
00ab6fec	adrp x0,0x2ce000
00ab6ff0	adrp x2,0x2a4000
00ab6ff4	add x0,x0,#0x16c
00ab6ff8	add x2,x2,#0x840
00ab6ffc	mov w1,#0x2a6
00ab7000	bl 0x00c342b0
00ab7004	mov w1,#0x7
00ab7008	mov w0,#0x9
00ab700c	movk w1,#0x8, LSL #16
00ab7010	mov x2,xzr
00ab7014	bl 0x00c342c0
00ab7018	mov w0,wzr
00ab701c	ldp x29,x30,[sp, #0x30]
00ab7020	ldp x20,x19,[sp, #0x20]
00ab7024	ldp x22,x21,[sp, #0x10]
00ab7028	ldp x24,x23,[sp], #0x40
00ab702c	ret
