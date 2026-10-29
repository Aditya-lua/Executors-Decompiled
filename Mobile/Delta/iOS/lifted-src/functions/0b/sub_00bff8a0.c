/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbff8a0..0xbffa38 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bff8a0_0 {
    unsigned long long field_0;
    struct st_bff8a0_0 *field_8;
    struct st_bff8a0_0 *field_10;
} st_bff8a0_0;


void sub_bff8a0(st_bff8a0_0 **a0, st_bff8a0_0 *a1)
{
    st_bff8a0_0 *v4;  // x9
    unsigned long long v5;  // 4150
    st_bff8a0_0 *v6;  // x20
    st_bff8a0_0 *ptr;  // x0
    st_bff8a0_0 *v8;  // x8
    long long v9;  // x0
    long long v10;  // x0
    st_bff8a0_0 *v11;  // x8
    char v0;  // [bp-0x78]
    char v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0 ^ 0x8000000000000000;
    v5 = arm64g_calculate_condition(0x44, a1->field_0, 0, 0);
    if (!(v5 & 1))
        v4 = 1;
    if (v4)
    {
        if (v4 == 1)
        {
            v6 = a1->field_10;
            if (v6 < 0)
            {
                a1 = v6;
                sub_c6b970(0, a1);
            }
            else
            {
                if (v6)
                {
                    ptr = _malloc(v6);
                    if (!ptr)
                    {
                        v9 = sub_c6b970(1, v6);
                        _free(a1->field_8);
                        sub_bfd1d4(&v0);
                        v10 = __Unwind_Resume(v9);
                        sub_c73e0c(v10);
                    }
                    _memcpy();
                    v8 = v6;
                }
                else
                {
                    v8 = 0;
                    ptr = 1;
                }
                *a0 = v8;
                a0[1] = ptr;
                a0[2] = v6;
                return;
            }
        }
        else
        {
            if (_malloc(64))
                sub_bfeb50(&v1, a1->field_8);
LABEL_bff9d4:
            sub_c6ba70(8, 64);
            sub_c6ba70(8, 64);
            __debugbreak();
        }
    }
    v11 = a1->field_8;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
    {
        *a0 = 0x8000000000000000;
        a0[1] = v11;
        return;
    }
    sub_c769bc();
    goto LABEL_bff9d4;
}
