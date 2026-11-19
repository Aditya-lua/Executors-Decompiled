; X509_SIG_get0 @ 00ab9808
00ab9808	cbz x1,0x00ab9814
00ab980c	ldr x8,[x0]
00ab9810	str x8,[x1]
00ab9814	cbz x2,0x00ab9820
00ab9818	ldr x8,[x0, #0x8]
00ab981c	str x8,[x2]
00ab9820	ret
