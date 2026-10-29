/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97c738..0x97c7f4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97c738_0 {
    char padding_0[24];
    struct st_97c738_0 *field_18;
    struct st_97c738_0 *field_20;
    struct st_97c738_0 *field_28;
    char padding_30[4];
    struct st_97c738_0 *field_34;
    char padding_3c[100];
    long long field_a0;
    char padding_a8[16];
    unsigned int field_b8;
} st_97c738_0;


int sub_97c738(st_97c738_0 *a0, unsigned long a1, long long a2, long long a3, unsigned long long a4, long long a5)
{
    unsigned int *v3;  // x8
    char *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0)
    {
        if ((a0->padding_30)[1])
        {
            if ((int)a0->field_28)
            {
                if (!a0->field_20)
                    goto LABEL_97c794;
                v3 = &a0->field_20->padding_a8[8];
                goto LABEL_97c78c;
            }
            else if (a0->field_18)
            {
                v3 = &a0->field_18[1].padding_a8[4];
LABEL_97c78c:
                *v3 = 1;
            }
        }
LABEL_97c794:
        if ((unsigned int)a4 == 207 && a0->field_18)
            sub_9796e0(*(long long *)&a0->field_18->padding_3c[96]);
    }
    sub_a368c8();
    sub_a369bc("ssl/quic/quic_impl.c", a2, a3);
    v0 = &v2;
    return sub_a36ae4(20, a4, a5, &v2);
}
