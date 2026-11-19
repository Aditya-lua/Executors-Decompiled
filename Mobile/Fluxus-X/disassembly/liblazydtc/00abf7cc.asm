; PKCS7_dataDecode @ 00abf7cc
00abf7cc	sub sp,sp,#0xe0
00abf7d0	stp x29,x30,[sp, #0xd0]
00abf7d4	add x29,sp,#0xd0
00abf7d8	stp x28,x27,[sp, #0x80]
00abf7dc	stp x26,x25,[sp, #0x90]
00abf7e0	stp x24,x23,[sp, #0xa0]
00abf7e4	stp x22,x21,[sp, #0xb0]
00abf7e8	stp x20,x19,[sp, #0xc0]
00abf7ec	stp xzr,xzr,[x29, #-0x60]
00abf7f0	stur wzr,[x29, #-0x64]
00abf7f4	cbz x0,0x00abf870
00abf7f8	mov x25,x3
00abf7fc	mov x22,x2
00abf800	mov x27,x1
00abf804	mov x20,x0
00abf808	bl 0x00c3f7f0
00abf80c	mov x24,x0
00abf810	bl 0x00c3f7d0
00abf814	mov x19,x0
00abf818	mov x0,x24
00abf81c	bl 0x00c3f7e0
00abf820	ldr x8,[x20, #0x20]
00abf824	cbz x8,0x00abf898
00abf828	mov x28,x0
00abf82c	ldr x0,[x20, #0x18]
00abf830	bl 0x00c37750
00abf834	cmp w0,#0x18
00abf838	str wzr,[x20, #0x10]
00abf83c	b.eq 0x00abf8c8
00abf840	cmp w0,#0x17
00abf844	b.eq 0x00abf964
00abf848	cmp w0,#0x16
00abf84c	b.ne 0x00abf9cc
00abf850	ldr x8,[x20, #0x20]
00abf854	ldr x21,[x8, #0x28]
00abf858	ldr x0,[x21, #0x18]
00abf85c	bl 0x00c37750
00abf860	cmp w0,#0x15
00abf864	b.ne 0x00abf9f4
00abf868	ldr x23,[x21, #0x20]
00abf86c	b 0x00abfa7c
00abf870	bl 0x00c342a0
00abf874	adrp x0,0x29e000
00abf878	adrp x2,0x2b6000
00abf87c	add x0,x0,#0x913
00abf880	add x2,x2,#0x32d
00abf884	mov w1,#0x1a2
00abf888	bl 0x00c342b0
00abf88c	mov w0,#0x21
00abf890	mov w1,#0x8f
00abf894	b 0x00abf8bc
00abf898	bl 0x00c342a0
00abf89c	adrp x0,0x29e000
00abf8a0	adrp x2,0x2b6000
00abf8a4	add x0,x0,#0x913
00abf8a8	add x2,x2,#0x32d
00abf8ac	mov w1,#0x1ab
00abf8b0	bl 0x00c342b0
00abf8b4	mov w0,#0x21
00abf8b8	mov w1,#0x7a
00abf8bc	mov x2,xzr
00abf8c0	bl 0x00c342c0
00abf8c4	b 0x00abfb48
00abf8c8	ldr x8,[x20, #0x20]
00abf8cc	add x0,sp,#0x38
00abf8d0	mov w1,#0x32
00abf8d4	mov w3,wzr
00abf8d8	ldp x9,x10,[x8, #0x28]
00abf8dc	stp x27,x10,[sp, #0x20]
00abf8e0	ldp x20,x21,[x9, #0x8]
00abf8e4	ldr x27,[x8, #0x8]
00abf8e8	ldr x2,[x20]
00abf8ec	bl 0x00c32500
00abf8f0	bl 0x00c35250
00abf8f4	add x1,sp,#0x38
00abf8f8	mov x0,x19
00abf8fc	mov x2,x28
00abf900	bl 0x00c35260
00abf904	mov x26,x0
00abf908	str x0,[sp, #0x30]
00abf90c	cbnz x0,0x00abf920
00abf910	add x0,sp,#0x38
00abf914	bl 0x00c35300
00abf918	str x0,[sp, #0x30]
00abf91c	cbz x0,0x00abfa2c
00abf920	bl 0x00c35240
00abf924	cbnz x22,0x00abfb98
00abf928	cbnz x21,0x00abfb98
00abf92c	bl 0x00c342a0
00abf930	adrp x0,0x29e000
00abf934	adrp x2,0x2b6000
00abf938	add x0,x0,#0x913
00abf93c	add x2,x2,#0x32d
00abf940	mov w1,#0x1f4
00abf944	bl 0x00c342b0
00abf948	mov w0,#0x21
00abf94c	mov w1,#0x7a
00abf950	mov x2,xzr
00abf954	bl 0x00c342c0
00abf958	mov x28,xzr
00abf95c	mov x20,xzr
00abf960	b 0x00abfae4
00abf964	ldr x8,[x20, #0x20]
00abf968	add x0,sp,#0x38
00abf96c	mov w1,#0x32
00abf970	mov w3,wzr
00abf974	ldp x8,x9,[x8, #0x8]
00abf978	ldp x20,x21,[x9, #0x8]
00abf97c	str x8,[sp, #0x28]
00abf980	ldr x2,[x20]
00abf984	bl 0x00c32500
00abf988	bl 0x00c35250
00abf98c	add x1,sp,#0x38
00abf990	mov x0,x19
00abf994	mov x2,x28
00abf998	bl 0x00c35260
00abf99c	mov x26,x0
00abf9a0	str x0,[sp, #0x30]
00abf9a4	cbnz x0,0x00abf9b8
00abf9a8	add x0,sp,#0x38
00abf9ac	bl 0x00c35300
00abf9b0	str x0,[sp, #0x30]
00abf9b4	cbz x0,0x00abfa4c
00abf9b8	str x27,[sp, #0x20]
00abf9bc	bl 0x00c35240
00abf9c0	mov x27,xzr
00abf9c4	cbz x22,0x00abf928
00abf9c8	b 0x00abfb98
00abf9cc	bl 0x00c342a0
00abf9d0	adrp x0,0x29e000
00abf9d4	adrp x2,0x2b6000
00abf9d8	add x0,x0,#0x913
00abf9dc	add x2,x2,#0x32d
00abf9e0	mov w1,#0x1ee
00abf9e4	bl 0x00c342b0
00abf9e8	mov w0,#0x21
00abf9ec	orr w1,wzr,#0x70
00abf9f0	b 0x00abfad0
00abf9f4	ldr x0,[x21, #0x18]
00abf9f8	bl 0x00c37750
00abf9fc	sub w8,w0,#0x15
00abfa00	cmp w8,#0x6
00abfa04	mov x23,xzr
00abfa08	b.cc 0x00abfa7c
00abfa0c	ldr x8,[x21, #0x20]
00abfa10	cbz x8,0x00abfa78
00abfa14	ldr w9,[x8]
00abfa18	mov x23,xzr
00abfa1c	cmp w9,#0x4
00abfa20	b.ne 0x00abfa7c
00abfa24	ldr x23,[x8, #0x8]
00abfa28	b 0x00abfa7c
00abfa2c	bl 0x00c35ed0
00abfa30	bl 0x00c342a0
00abfa34	adrp x0,0x29e000
00abfa38	adrp x2,0x2b6000
00abfa3c	add x0,x0,#0x913
00abfa40	add x2,x2,#0x32d
00abfa44	mov w1,#0x1d3
00abfa48	b 0x00abfa68
00abfa4c	bl 0x00c35ed0
00abfa50	bl 0x00c342a0
00abfa54	adrp x0,0x29e000
00abfa58	adrp x2,0x2b6000
00abfa5c	add x0,x0,#0x913
00abfa60	add x2,x2,#0x32d
00abfa64	mov w1,#0x1e8
00abfa68	bl 0x00c342b0
00abfa6c	mov w0,#0x21
00abfa70	mov w1,#0x6f
00abfa74	b 0x00abfad0
00abfa78	mov x23,xzr
00abfa7c	ldr x0,[x20, #0x18]
00abfa80	bl 0x00c37750
00abfa84	cmp w0,#0x16
00abfa88	b.ne 0x00abfb70
00abfa8c	mov w1,#0x2
00abfa90	mov x0,x20
00abfa94	mov x2,xzr
00abfa98	mov x3,xzr
00abfa9c	bl 0x00c3f770
00abfaa0	mov x21,x23
00abfaa4	cbnz x23,0x00abfb78
00abfaa8	cbnz x0,0x00abfb78
00abfaac	bl 0x00c342a0
00abfab0	adrp x0,0x29e000
00abfab4	adrp x2,0x2b6000
00abfab8	add x0,x0,#0x913
00abfabc	add x2,x2,#0x32d
00abfac0	mov w1,#0x1bc
00abfac4	bl 0x00c342b0
00abfac8	mov w0,#0x21
00abfacc	mov w1,#0x9b
00abfad0	mov x2,xzr
00abfad4	bl 0x00c342c0
00abfad8	mov x28,xzr
00abfadc	mov x20,xzr
00abfae0	mov x26,xzr
00abfae4	mov x19,xzr
00abfae8	mov w23,wzr
00abfaec	mov x22,xzr
00abfaf0	mov x0,x26
00abfaf4	bl 0x00c357d0
00abfaf8	ldur x0,[x29, #-0x60]
00abfafc	ldursw x1,[x29, #-0x64]
00abfb00	adrp x21,0x29e000
00abfb04	add x21,x21,#0x913
00abfb08	mov w3,#0x29c
00abfb0c	mov x2,x21
00abfb10	bl 0x00c345e0
00abfb14	sxtw x1,w23
00abfb18	mov w3,#0x29d
00abfb1c	mov x0,x19
00abfb20	mov x2,x21
00abfb24	bl 0x00c345e0
00abfb28	mov x0,x22
00abfb2c	bl 0x00c355e0
00abfb30	mov x0,x20
00abfb34	bl 0x00c355e0
00abfb38	mov x0,x28
00abfb3c	bl 0x00c355e0
00abfb40	mov x0,xzr
00abfb44	bl 0x00c355e0
00abfb48	mov x22,xzr
00abfb4c	mov x0,x22
00abfb50	ldp x29,x30,[sp, #0xd0]
00abfb54	ldp x20,x19,[sp, #0xc0]
00abfb58	ldp x22,x21,[sp, #0xb0]
00abfb5c	ldp x24,x23,[sp, #0xa0]
00abfb60	ldp x26,x25,[sp, #0x90]
00abfb64	ldp x28,x27,[sp, #0x80]
00abfb68	add sp,sp,#0xe0
00abfb6c	ret
00abfb70	mov x21,x23
00abfb74	cbz x23,0x00abfaac
00abfb78	stp x27,xzr,[sp, #0x20]
00abfb7c	ldr x8,[x20, #0x20]
00abfb80	mov x26,xzr
00abfb84	str xzr,[sp, #0x30]
00abfb88	mov x9,xzr
00abfb8c	ldr x27,[x8, #0x8]
00abfb90	mov x20,xzr
00abfb94	cbz x22,0x00abf928
00abfb98	stp x22,x26,[sp, #0x10]
00abfb9c	stp x20,x21,[sp]
00abfba0	cbz x27,0x00abfc7c
00abfba4	mov x0,x27
00abfba8	bl 0x00c325e0
00abfbac	cmp w0,#0x1
00abfbb0	b.lt 0x00abfd3c
00abfbb4	mov w21,wzr
00abfbb8	mov x22,xzr
00abfbbc	mov x0,x27
00abfbc0	mov w1,w21
00abfbc4	bl 0x00c32610
00abfbc8	mov x23,x0
00abfbcc	bl 0x00c3bfe0
00abfbd0	bl 0x00c32240
00abfbd4	mov x20,x0
00abfbd8	cbz x0,0x00abfdb0
00abfbdc	ldr x2,[x23]
00abfbe0	add x0,sp,#0x38
00abfbe4	mov w1,#0x32
00abfbe8	mov w3,wzr
00abfbec	bl 0x00c32500
00abfbf0	bl 0x00c35250
00abfbf4	add x1,sp,#0x38
00abfbf8	mov x0,x19
00abfbfc	mov x2,x28
00abfc00	bl 0x00c357f0
00abfc04	mov x26,x0
00abfc08	mov x23,x0
00abfc0c	cbnz x0,0x00abfc20
00abfc10	add x0,sp,#0x38
00abfc14	bl 0x00c35310
00abfc18	mov x23,x0
00abfc1c	cbz x0,0x00abfe10
00abfc20	bl 0x00c35240
00abfc24	mov w1,#0x6f
00abfc28	mov x0,x20
00abfc2c	mov x2,xzr
00abfc30	mov x3,x23
00abfc34	bl 0x00c321a0
00abfc38	mov x23,x0
00abfc3c	mov x0,x26
00abfc40	bl 0x00c35800
00abfc44	cmp x23,#0x0
00abfc48	b.le 0x00abfdcc
00abfc4c	cbz x22,0x00abfc60
00abfc50	mov x0,x22
00abfc54	mov x1,x20
00abfc58	bl 0x00c35640
00abfc5c	b 0x00abfc64
00abfc60	mov x22,x20
00abfc64	mov x0,x27
00abfc68	add w21,w21,#0x1
00abfc6c	bl 0x00c325e0
00abfc70	cmp w21,w0
00abfc74	b.lt 0x00abfbbc
00abfc78	b 0x00abfc80
00abfc7c	mov x22,xzr
00abfc80	ldr x21,[sp, #0x30]
00abfc84	cbz x21,0x00abfd48
00abfc88	bl 0x00c3bfd0
00abfc8c	bl 0x00c32240
00abfc90	ldr x26,[sp, #0x18]
00abfc94	mov x28,x0
00abfc98	cbz x0,0x00abfd70
00abfc9c	ldp x23,x27,[sp, #0x20]
00abfca0	cbz x25,0x00abfe7c
00abfca4	mov x0,x27
00abfca8	bl 0x00c325e0
00abfcac	cmp w0,#0x1
00abfcb0	b.lt 0x00abfd14
00abfcb4	mov w19,wzr
00abfcb8	mov x0,x27
00abfcbc	mov w1,w19
00abfcc0	bl 0x00c32610
00abfcc4	ldr x8,[x0, #0x8]
00abfcc8	mov x20,x0
00abfccc	mov x0,x25
00abfcd0	ldr x21,[x8]
00abfcd4	bl 0x00c32cf0
00abfcd8	mov x1,x0
00abfcdc	mov x0,x21
00abfce0	bl 0x00c36560
00abfce4	cbnz w0,0x00abfd00
00abfce8	mov x0,x25
00abfcec	bl 0x00c3f060
00abfcf0	ldr x8,[x20, #0x8]
00abfcf4	ldr x1,[x8, #0x8]
00abfcf8	bl 0x00c37560
00abfcfc	cbz w0,0x00abfe4c
00abfd00	mov x0,x27
00abfd04	add w19,w19,#0x1
00abfd08	bl 0x00c325e0
00abfd0c	cmp w19,w0
00abfd10	b.lt 0x00abfcb8
00abfd14	bl 0x00c342a0
00abfd18	adrp x0,0x29e000
00abfd1c	adrp x2,0x2b6000
00abfd20	add x0,x0,#0x913
00abfd24	add x2,x2,#0x32d
00abfd28	mov w1,#0x238
00abfd2c	bl 0x00c342b0
00abfd30	mov w0,#0x21
00abfd34	mov w1,#0x73
00abfd38	b 0x00abfd98
00abfd3c	mov x22,xzr
00abfd40	ldr x21,[sp, #0x30]
00abfd44	cbnz x21,0x00abfc88
00abfd48	ldr x26,[sp, #0x18]
00abfd4c	mov w23,wzr
00abfd50	ldp x8,x19,[sp, #0x8]
00abfd54	cbz x19,0x00ac007c
00abfd58	mov x0,x22
00abfd5c	mov x1,x19
00abfd60	bl 0x00c35640
00abfd64	mov x0,x26
00abfd68	bl 0x00c357d0
00abfd6c	b 0x00abfb4c
00abfd70	bl 0x00c342a0
00abfd74	adrp x0,0x29e000
00abfd78	adrp x2,0x2b6000
00abfd7c	add x0,x0,#0x913
00abfd80	add x2,x2,#0x32d
00abfd84	mov w1,#0x221
00abfd88	bl 0x00c342b0
00abfd8c	mov w1,#0x20
00abfd90	mov w0,#0x21
00abfd94	movk w1,#0x8, LSL #16
00abfd98	mov x2,xzr
00abfd9c	bl 0x00c342c0
00abfda0	mov x20,xzr
00abfda4	mov x19,xzr
00abfda8	mov w23,wzr
00abfdac	b 0x00abfaf0
00abfdb0	bl 0x00c342a0
00abfdb4	adrp x0,0x29e000
00abfdb8	adrp x2,0x2b6000
00abfdbc	add x0,x0,#0x913
00abfdc0	add x2,x2,#0x32d
00abfdc4	mov w1,#0x1fd
00abfdc8	b 0x00abfde4
00abfdcc	bl 0x00c342a0
00abfdd0	adrp x0,0x29e000
00abfdd4	adrp x2,0x2b6000
00abfdd8	add x0,x0,#0x913
00abfddc	add x2,x2,#0x32d
00abfde0	mov w1,#0x213
00abfde4	bl 0x00c342b0
00abfde8	mov w1,#0x20
00abfdec	mov w0,#0x21
00abfdf0	movk w1,#0x8, LSL #16
00abfdf4	mov x2,xzr
00abfdf8	bl 0x00c342c0
00abfdfc	mov x28,xzr
00abfe00	mov x19,xzr
00abfe04	mov w23,wzr
00abfe08	ldr x26,[sp, #0x18]
00abfe0c	b 0x00abfaf0
00abfe10	bl 0x00c35ed0
00abfe14	bl 0x00c342a0
00abfe18	adrp x0,0x29e000
00abfe1c	adrp x2,0x2b6000
00abfe20	add x0,x0,#0x913
00abfe24	add x2,x2,#0x32d
00abfe28	mov w1,#0x20c
00abfe2c	bl 0x00c342b0
00abfe30	mov w0,#0x21
00abfe34	mov w1,#0x6d
00abfe38	mov x2,xzr
00abfe3c	bl 0x00c342c0
00abfe40	mov x28,xzr
00abfe44	mov x19,xzr
00abfe48	b 0x00abfe08
00abfe4c	ldr x21,[sp, #0x30]
00abfe50	cbz x25,0x00abfe7c
00abfe54	sub x0,x29,#0x60
00abfe58	sub x1,x29,#0x64
00abfe5c	mov x2,x20
00abfe60	mov x3,x23
00abfe64	mov x4,xzr
00abfe68	str x24,[x20, #0x28]
00abfe6c	bl 0x00ac00d0
00abfe70	tbnz w0,#0x1f,0x00abfda0
00abfe74	bl 0x00c323e0
00abfe78	b 0x00abfee0
00abfe7c	mov x0,x27
00abfe80	bl 0x00c325e0
00abfe84	cmp w0,#0x1
00abfe88	b.lt 0x00abfee0
00abfe8c	mov w19,wzr
00abfe90	mov x0,x27
00abfe94	mov w1,w19
00abfe98	bl 0x00c32610
00abfe9c	mov x20,x0
00abfea0	str x24,[x0, #0x28]
00abfea4	mov x0,x21
00abfea8	bl 0x00c34bd0
00abfeac	sxtw x4,w0
00abfeb0	sub x0,x29,#0x60
00abfeb4	sub x1,x29,#0x64
00abfeb8	mov x2,x20
00abfebc	mov x3,x23
00abfec0	bl 0x00ac00d0
00abfec4	tbnz w0,#0x1f,0x00abfda0
00abfec8	bl 0x00c323e0
00abfecc	mov x0,x27
00abfed0	add w19,w19,#0x1
00abfed4	bl 0x00c325e0
00abfed8	cmp w19,w0
00abfedc	b.lt 0x00abfe90
00abfee0	mov w1,#0x81
00abfee4	sub x3,x29,#0x58
00abfee8	mov x0,x28
00abfeec	mov x2,xzr
00abfef0	stur xzr,[x29, #-0x58]
00abfef4	bl 0x00c321a0
00abfef8	ldur x0,[x29, #-0x58]
00abfefc	mov x1,x21
00abff00	mov x2,xzr
00abff04	mov x3,xzr
00abff08	mov x4,xzr
00abff0c	mov w5,wzr
00abff10	bl 0x00c34be0
00abff14	cmp w0,#0x1
00abff18	b.lt 0x00abfda0
00abff1c	ldr x8,[sp]
00abff20	ldur x0,[x29, #-0x58]
00abff24	ldr x1,[x8, #0x8]
00abff28	bl 0x00c3cee0
00abff2c	cmp w0,#0x1
00abff30	b.lt 0x00abfda0
00abff34	ldur x0,[x29, #-0x58]
00abff38	bl 0x00c3cca0
00abff3c	mov w23,w0
00abff40	cmp w0,#0x1
00abff44	b.lt 0x00abfda0
00abff48	sxtw x20,w23
00abff4c	adrp x1,0x29e000
00abff50	add x1,x1,#0x913
00abff54	mov w2,#0x25e
00abff58	mov x0,x20
00abff5c	bl 0x00c32320
00abff60	mov x19,x0
00abff64	cbz x0,0x00ac0068
00abff68	ldur x0,[x29, #-0x58]
00abff6c	mov x1,x19
00abff70	bl 0x00c3ccb0
00abff74	cmp w0,#0x1
00abff78	b.lt 0x00ac0068
00abff7c	ldur x21,[x29, #-0x60]
00abff80	cbz x21,0x00abff8c
00abff84	ldur w24,[x29, #-0x64]
00abff88	b 0x00abffa0
00abff8c	stur x19,[x29, #-0x60]
00abff90	mov x21,x19
00abff94	mov w24,w23
00abff98	mov x19,xzr
00abff9c	stur w23,[x29, #-0x64]
00abffa0	ldur x0,[x29, #-0x58]
00abffa4	bl 0x00c3cca0
00abffa8	cmp w24,w0
00abffac	b.eq 0x00abfff0
00abffb0	ldur x0,[x29, #-0x58]
00abffb4	mov w1,w24
00abffb8	bl 0x00c3ccc0
00abffbc	cmp w0,#0x0
00abffc0	b.gt 0x00abfff0
00abffc4	adrp x2,0x29e000
00abffc8	sxtw x1,w24
00abffcc	add x2,x2,#0x913
00abffd0	mov w3,#0x271
00abffd4	mov x0,x21
00abffd8	bl 0x00c345e0
00abffdc	stur x19,[x29, #-0x60]
00abffe0	mov w24,w23
00abffe4	mov x21,x19
00abffe8	mov x19,xzr
00abffec	stur w23,[x29, #-0x64]
00abfff0	bl 0x00c323e0
00abfff4	ldur x0,[x29, #-0x58]
00abfff8	mov x1,xzr
00abfffc	mov x2,xzr
00ac0000	mov x3,x21
00ac0004	mov x4,xzr
00ac0008	mov w5,wzr
00ac000c	bl 0x00c34be0
00ac0010	cmp w0,#0x1
00ac0014	b.lt 0x00ac0068
00ac0018	sxtw x1,w24
00ac001c	adrp x24,0x29e000
00ac0020	add x24,x24,#0x913
00ac0024	mov w3,#0x27c
00ac0028	mov x0,x21
00ac002c	mov x2,x24
00ac0030	bl 0x00c345e0
00ac0034	mov w3,#0x27e
00ac0038	mov x0,x19
00ac003c	mov x1,x20
00ac0040	mov x2,x24
00ac0044	stur xzr,[x29, #-0x60]
00ac0048	bl 0x00c345e0
00ac004c	cbz x22,0x00ac0070
00ac0050	mov x0,x22
00ac0054	mov x1,x28
00ac0058	bl 0x00c35640
00ac005c	ldp x8,x19,[sp, #0x8]
00ac0060	cbnz x19,0x00abfd58
00ac0064	b 0x00ac007c
00ac0068	mov x20,xzr
00ac006c	b 0x00abfaf0
00ac0070	mov x22,x28
00ac0074	ldp x8,x19,[sp, #0x8]
00ac0078	cbnz x19,0x00abfd58
00ac007c	ldr w1,[x8]
00ac0080	cmp w1,#0x0
00ac0084	b.le 0x00ac009c
00ac0088	ldr x0,[x8, #0x8]
00ac008c	bl 0x00c31a50
00ac0090	mov x19,x0
00ac0094	cbnz x0,0x00abfd58
00ac0098	b 0x00ac00c4
00ac009c	bl 0x00c32280
00ac00a0	bl 0x00c32240
00ac00a4	mov x19,x0
00ac00a8	cbz x0,0x00ac00c4
00ac00ac	mov w1,#0x82
00ac00b0	mov x0,x19
00ac00b4	mov x2,xzr
00ac00b8	mov x3,xzr
00ac00bc	bl 0x00c321a0
00ac00c0	b 0x00abfd58
00ac00c4	mov x28,xzr
00ac00c8	mov x20,xzr
00ac00cc	b 0x00abfaf0
