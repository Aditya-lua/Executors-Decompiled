/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974000..0x974a80 (2688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_974000_0 {
    unsigned long long field_0;
    long long field_8;
} st_974000_0;

typedef struct st_974000_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_974000_1;

extern st_974000_1 g_d283e8;
extern char g_10002b0;

unsigned long long sub_974000(long long a0, void* a1, long long a2, unsigned long a3, long long a4, long long a5)
{
    unsigned long long v8;  // x0
    long long i;  // x24
    long long v10;  // x23
    st_974000_0 *v11;  // x9
    long long v12;  // x8
    long long v13;  // x9
    long long v14;  // x9
    long long v0;  // [bp-0x318]
    unsigned long iter;  // [bp-0x310]
    long long v2;  // [bp-0x308]
    long long v3;  // [bp-0x308]
    char v4;  // [bp-0x2b0]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    sub_973a30();
    sub_973a98(a0, "packet_type");
    if ((*(int *)a1 & 253) != 4)
        sub_973b10(a0, "packet_number", a2);
    sub_973b78(a0, "dcid", a1 + 9, (char)a1[8]);
    if (*(char *)a1 != 5)
        sub_973b78(a0, "scid", a1 + 30, (char)a1[29]);
    if ((long long)a1[64])
    {
        sub_973a30(a0, "token");
        sub_973a30(a0, "raw");
        sub_973b78(a0, "data", (long long)a1[56], (long long)a1[64]);
        sub_973a5c(a0);
        sub_973a5c(a0);
    }
    sub_973a5c(a0);
    v8 = sub_973b10(a0, "datagram_id", a5);
    if ((*(int *)a1 & 253) != 4)
    {
        sub_973a64(a0, "frames");
        if (a4)
        {
            i = 0;
            v10 = 0;
            v0 = a4;
            do
            {
                v11 = a3 + i * 16;
                v12 = v11->field_8;
                if (v12 < 0)
                    break;
                iter = v11->field_0;
                v2 = v12;
                if (v12)
                {
                    while (1)
                    {
                        if (v10)
                        {
                            if ((unsigned long long)v10 < (unsigned long long)v12)
                                v13 = v10;
                            else
                                v13 = v12;
                            v14 = v13;
                            v12 -= v14;
                            iter += v14;
                            v2 = v12;
                            v10 -= v14;
                            if (!v12)
                                break;
                        }
                        else
                        {
                            sub_973a30(a0, 0);
                            if (!sub_98ec18(&iter, &v4, 0))
                            {
                                v10 = -0x1;
                                v3 = v2;
                            }
                            else if (30 >= v4)
                            {
                                goto *((void *)(sub_974240 + (&g_d283e8.field_0)[v4] * 4));
                            }
                            else
                            {
                                sub_973a98(a0, "frame_type", "unknown");
                                sub_973b10(a0, "frame_type_value", v4);
                                sub_973a30(a0, "raw");
                                sub_973b78(a0, "data", iter, v2);
                                sub_973a5c(a0);
                                v10 = 0;
                                iter += v2;
                                v3 = 0;
                                sub_973b10(a0, "length", v2 - v3);
                            }
                            v2 = v3;
                            sub_973a5c(a0);
                            v12 = v2;
                            if (!v12)
                                break;
                        }
                    }
                }
                i += 1;
            } while (i != a4);
        }
        v8 = sub_973a90(a0);
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}
