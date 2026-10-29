/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123f64..0x123ffc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01960;
extern unsigned short g_f01962;
extern unsigned short g_f01964;
extern unsigned short g_f01966;
extern unsigned long long g_f01a48;
extern unsigned short g_f0ea00;
extern unsigned short g_f0ea02;
extern unsigned short g_f0ea04;
extern unsigned short g_f0ea06;

long long sub_123f64(void)
{
    unsigned long v0;  // x0

    g_f0ea00 = 60210;
    g_f0ea02 = 49888;
    g_f0ea04 = 34654;
    g_f0ea06 = 37692;
    g_f01960 = g_f0ea00 ^ g_f01960;
    g_f01962 = g_f0ea02 ^ g_f01962;
    g_f01964 = g_f0ea04 ^ g_f01964;
    g_f01966 = g_f0ea06 ^ g_f01966;
    g_f01a48 = g_f01a48 ^ 10609503663244241714;
    return v0;
}
