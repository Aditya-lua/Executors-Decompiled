/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00e44..0xb00f38 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b00e44_0 {
    char padding_0[240];
    unsigned int field_f0;
} st_b00e44_0;

extern char g_f0d569;

unsigned long long sub_b00e44(unsigned long a0, unsigned long a1, unsigned long a2, st_b00e44_0 *a3, unsigned long a4, unsigned long a5)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a3->field_f0)
    {
    case 14:
        if (!(g_f0d569 >> 4 & 1))
        {
            sub_a91640();
            break;
        }
        else
        {
            sub_a8c860();
            break;
        }
    case 12:
        if (!(g_f0d569 >> 4 & 1))
        {
            sub_a90110();
            break;
        }
        else
        {
            sub_a8a6c0();
            break;
        }
    case 10:
        if (!(g_f0d569 >> 4 & 1))
        {
            sub_a8ed70();
            break;
        }
        else
        {
            sub_a88840();
        }
        break;
    default:
        goto LABEL_b00f28;
    }
LABEL_b00f28:
    return a2 & 0xfffffffffffffff0;
}
