/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d089c..0x9d0aa4 (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d089c_0 {
    struct st_9d089c_0 *field_0;
    struct st_9d089c_0 *field_8;
    struct st_9d089c_0 *field_10;
    char padding_18[4];
    struct st_9d089c_0 *field_1c;
} st_9d089c_0;

extern long long g_9d0aa4;
extern long long g_f127b0;

st_9d089c_0 * sub_9d089c(st_9d089c_0 *a0, st_9d089c_0 *a1)
{
    st_9d089c_0 *v2;  // x0
    st_9d089c_0 *v3;  // x19
    st_9d089c_0 *v4;  // x0
    st_9d089c_0 *v5;  // x0
    st_9d089c_0 *i;  // x0
    st_9d089c_0 *v7;  // x0
    long long v8;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 > a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/async/async.c", 357, "ASYNC_init_thread");
        sub_a36abc(0x33, 103, 0);
        goto LABEL_9d08e0;
    }
    v2 = sub_a6afb8(0x100, 0);
    if ((unsigned int)v2 && (v2 = sub_a6bce8(0, 0, &g_9d0aa4), (unsigned int)v2 && (v2 = sub_a6bffc(24, "crypto/async/async.c", 367), v2)))
    {
        v3 = v2;
        v4 = sub_ad61e0(0, a1);
        v3->field_0 = v4;
        if (v4)
        {
            v3->field_10 = a0;
            if (a1)
            {
                v5 = sub_a6bffc(48, "crypto/async/async.c", 82);
                if (v5)
                {
                    *(unsigned int *)(v5->padding_18)[1] = 0;
                    sub_a6c2e4(v5->field_10, "crypto/async/async.c", 94);
                    sub_a6c2e4(v5, "crypto/async/async.c", 96);
                }
            }
            v3->field_8 = 0;
            if (sub_a7bbe8(&g_f127b0, v3))
            {
                v2 = 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/async/async.c", 398, "ASYNC_init_thread");
                sub_a36abc(0x33, 101, 0);
                if (v3->field_0)
                {
                    i = sub_ad692c(v3->field_0);
                    if (i)
                    {
                        do
                        {
                            sub_a6c2e4(i->field_10, "crypto/async/async.c", 94);
                            sub_a6c2e4(i, "crypto/async/async.c", 96);
                            i = sub_ad692c(v3->field_0);
                        } while (i);
                    }
                }
                sub_ad6020(v3->field_0);
                v7 = v3;
                v8 = 406;
LABEL_9d0a9c:
                sub_a6c2e4(v7, "crypto/async/async.c", v8);
LABEL_9d08e0:
                v2 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/async/async.c", 373, "ASYNC_init_thread");
            sub_a36abc(0x33, 0x8000f, 0);
            v7 = v3;
            v8 = 374;
            goto LABEL_9d0a9c;
        }
    }
    return (unsigned int)v2;
}
