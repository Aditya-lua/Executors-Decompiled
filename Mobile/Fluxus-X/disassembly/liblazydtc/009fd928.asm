; BIO_printf @ 009fd928
009fd928	sub sp,sp,#0x110
009fd92c	orr x8,xzr,#-0x7f00000080
009fd930	stp x29,x30,[sp, #0x100]
009fd934	add x29,sp,#0x100
009fd938	movk x8,#0xffd0
009fd93c	mov x9,sp
009fd940	add x10,sp,#0x80
009fd944	add x11,x29,#0x10
009fd948	stur x8,[x29, #-0x18]
009fd94c	add x8,x9,#0x80
009fd950	add x9,x10,#0x30
009fd954	stp x11,x9,[x29, #-0x30]
009fd958	stur x8,[x29, #-0x20]
009fd95c	stp q0,q1,[sp]
009fd960	ldp q1,q0,[x29, #-0x30]
009fd964	stp x2,x3,[sp, #0x80]
009fd968	sub x2,x29,#0x50
009fd96c	str x28,[sp, #0xf0]
009fd970	stp q6,q7,[sp, #0x60]
009fd974	stp q4,q5,[sp, #0x40]
009fd978	stp q2,q3,[sp, #0x20]
009fd97c	stp x6,x7,[sp, #0xa0]
009fd980	stp x4,x5,[sp, #0x90]
009fd984	stp q1,q0,[x29, #-0x50]
009fd988	bl 0x009fd99c
009fd98c	ldp x29,x30,[sp, #0x100]
009fd990	ldr x28,[sp, #0xf0]
009fd994	add sp,sp,#0x110
009fd998	ret
