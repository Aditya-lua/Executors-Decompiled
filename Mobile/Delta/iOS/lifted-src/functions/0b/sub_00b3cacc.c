/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3cacc..0xb3cc44 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3cacc_0 {
    long long field_0;
    long long field_8;
    char field_10;
    char field_11;
    char padding_12[70];
    long long field_58;
} st_b3cacc_0;

extern char g_10002b0;

unsigned long long sub_b3cacc(st_b3cacc_0 *a0, unsigned long long a1, unsigned long long a2, long long a3)
{
    unsigned long long v4;  // x0
    char v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    v4 = sub_a2f9e0();
    if ((unsigned int)v4)
    {
        if (a1 & 3)
        {
            if (a0->field_58 != a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ecx_kmgmt.c", 964, "ecx_validate");
                sub_a36abc(57, 173, 0);
                goto LABEL_b3cb64;
            }
            if (!(a1 >> 1 & 1))
            {
                if (a1 & 1)
                    goto LABEL_b3cb7c;
                v4 = 1;
            }
            else
            {
                v4 = a0->field_10 & 1;
                if (a1 & 1 && (unsigned int)v4)
                {
LABEL_b3cb7c:
                    v4 = *(long long *)&a0->padding_12[62] != 0;
                }
            }
            if ((a1 & 3) == 3)
            {
                if ((a2 & 0xfffffffe) == 2)
                {
                    if ((unsigned int)v4)
                    {
                        if (a2 == 2)
                        {
                            v4 = sub_a0d9ac(a0->field_0, &v0, *(long long *)&a0->padding_12[62], a0->field_8);
                            if ((unsigned int)v4)
                                goto LABEL_b3cbf8;
                        }
                        else
                        {
                            v4 = sub_a084f8(a0->field_0, &v0, *(long long *)&a0->padding_12[62], a0->field_8);
                            if ((unsigned int)v4)
                                goto LABEL_b3cbf8;
                        }
                    }
                }
                else
                {
                    if ((unsigned int)v4)
                    {
                        if (a2 == 1)
                        {
                            sub_a07c88(&v0, *(long long *)&a0->padding_12[62]);
                            goto LABEL_b3cbf8;
                        }
                        else if (a2)
                        {
LABEL_b3cb64:
                            v4 = 0;
                        }
                        else
                        {
                            sub_a0fdb8(&v0, *(long long *)&a0->padding_12[62]);
LABEL_b3cbf8:
                            v4 = !sub_a66f20(&a0->field_11, &v0, a0->field_58);
                        }
                    }
                }
            }
        }
        else
        {
            v4 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v4;
    ___stack_chk_fail();
}
