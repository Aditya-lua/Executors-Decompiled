/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a4a0..0x99a5b8 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_99a4a0(unsigned long long *a0)
{
    unsigned long long v4;  // w0
    unsigned int *v5;  // x0
    unsigned int *v6;  // x0
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (_socketpair(1, 1, 0, &v0) >> 31 & 1)
    {
        sub_a368c8();
        v6 = ___error(sub_a369bc("ssl/rio/rio_notifier.c", 294, "ossl_rio_notifier_init"), 294, "ossl_rio_notifier_init");
        sub_a36abc(2, *v6, "calling socketpair()");
        goto LABEL_99a588;
    }
    else if (sub_9d6650((unsigned int)v0, 1) && sub_9d6650(*(unsigned int *)((void*)&v0 + 4), 1))
    {
        *a0 = v0;
        v4 = 1;
    }
    else
    {
        sub_a368c8();
        v5 = ___error(sub_a369bc("ssl/rio/rio_notifier.c", 307, "ossl_rio_notifier_init"), 307, "ossl_rio_notifier_init");
        sub_a36abc(2, *v5, "calling BIO_socket_nbio()");
        sub_9d66cc(*(unsigned int *)((void*)&v0 + 4));
        sub_9d66cc((unsigned int)v0);
LABEL_99a588:
        v4 = 0;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
