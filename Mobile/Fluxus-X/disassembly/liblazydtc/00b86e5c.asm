; FUN_00b86e5c @ 00b86e5c
00b86e5c	stp x24,x23,[sp, #-0x40]!
00b86e60	stp x22,x21,[sp, #0x10]
00b86e64	stp x20,x19,[sp, #0x20]
00b86e68	stp x29,x30,[sp, #0x30]
00b86e6c	add x29,sp,#0x30
00b86e70	mov w21,w3
00b86e74	mov w24,w2
00b86e78	mov x19,x1
00b86e7c	bl 0x00c43190
00b86e80	mov w23,w0
00b86e84	cbnz w0,0x00b8700c
00b86e88	ldr x20,[x19]
00b86e8c	and w10,w24,#0xfffffffe
00b86e90	ldrh w22,[x20]
00b86e94	ldr w8,[x20, #0x8]
00b86e98	and w9,w22,#0x7000
00b86e9c	cmp w9,#0x4, LSL #12
00b86ea0	csel w9,w10,w24,eq
00b86ea4	bics wzr,w9,w8
00b86ea8	b.ne 0x00b86ffc
00b86eac	cbz w21,0x00b86edc
00b86eb0	mov w9,#0x8ff
00b86eb4	and w8,w21,#0xffffff00
00b86eb8	movk w9,#0x600, LSL #16
00b86ebc	cmp w8,w9
00b86ec0	b.gt 0x00b86ee4
00b86ec4	mov w9,#0x200
00b86ec8	movk w9,#0x600, LSL #16
00b86ecc	cmp w8,w9
00b86ed0	b.eq 0x00b86f18
00b86ed4	mov w9,#0x300
00b86ed8	b 0x00b86ef8
00b86edc	mov w23,wzr
00b86ee0	b 0x00b8700c
00b86ee4	mov w9,#0x900
00b86ee8	movk w9,#0x600, LSL #16
00b86eec	cmp w8,w9
00b86ef0	b.eq 0x00b86f18
00b86ef4	mov w9,#0x1300
00b86ef8	movk w9,#0x600, LSL #16
00b86efc	cmp w8,w9
00b86f00	b.eq 0x00b86f18
00b86f04	lsr w9,w21,#0x9
00b86f08	orr w9,w9,#0x1
00b86f0c	orr w10,wzr,#0x30003
00b86f10	cmp w9,w10
00b86f14	b.ne 0x00b86f48
00b86f18	ands w9,w21,#0xff
00b86f1c	b.eq 0x00b86f48
00b86f20	mov w10,#0x8ff
00b86f24	movk w10,#0x600, LSL #16
00b86f28	cmp w8,w10
00b86f2c	b.gt 0x00b86f6c
00b86f30	mov w10,#0x200
00b86f34	movk w10,#0x600, LSL #16
00b86f38	cmp w8,w10
00b86f3c	b.eq 0x00b86fa0
00b86f40	mov w10,#0x300
00b86f44	b 0x00b86f80
00b86f48	and w8,w21,#0x7f000000
00b86f4c	mov w9,#0x5000000
00b86f50	cmp w8,w9
00b86f54	b.eq 0x00b86f64
00b86f58	orr w9,wzr,#0x3000000
00b86f5c	cmp w8,w9
00b86f60	b.ne 0x00b86fbc
00b86f64	tbnz w21,#0xf,0x00b86fb4
00b86f68	b 0x00b86fcc
00b86f6c	mov w10,#0x900
00b86f70	movk w10,#0x600, LSL #16
00b86f74	cmp w8,w10
00b86f78	b.eq 0x00b86fa0
00b86f7c	mov w10,#0x1300
00b86f80	movk w10,#0x600, LSL #16
00b86f84	cmp w8,w10
00b86f88	b.eq 0x00b86fa0
00b86f8c	lsr w8,w21,#0x9
00b86f90	orr w8,w8,#0x1
00b86f94	orr w10,wzr,#0x30003
00b86f98	cmp w8,w10
00b86f9c	b.ne 0x00b86fcc
00b86fa0	orr w8,w9,#0x2000000
00b86fa4	mov w9,#0xff
00b86fa8	movk w9,#0x200, LSL #16
00b86fac	cmp w8,w9
00b86fb0	b.ne 0x00b86fcc
00b86fb4	mov w23,#0xffffff79
00b86fb8	b 0x00b87000
00b86fbc	mov w8,#0xff
00b86fc0	movk w8,#0x200, LSL #16
00b86fc4	cmp w21,w8
00b86fc8	b.eq 0x00b86fb4
00b86fcc	ldr w1,[x20, #0xc]
00b86fd0	mov w0,w22
00b86fd4	mov w2,w21
00b86fd8	bl 0x00b909c8
00b86fdc	mov w23,wzr
00b86fe0	cbnz w0,0x00b8700c
00b86fe4	ldr w1,[x20, #0x10]
00b86fe8	mov w0,w22
00b86fec	mov w2,w21
00b86ff0	bl 0x00b909c8
00b86ff4	mov w23,wzr
00b86ff8	cbnz w0,0x00b8700c
00b86ffc	mov w23,#0xffffff7b
00b87000	mov x0,x20
00b87004	str xzr,[x19]
00b87008	bl 0x00c431e0
00b8700c	ldp x29,x30,[sp, #0x30]
00b87010	ldp x20,x19,[sp, #0x20]
00b87014	ldp x22,x21,[sp, #0x10]
00b87018	mov w0,w23
00b8701c	ldp x24,x23,[sp], #0x40
00b87020	ret
